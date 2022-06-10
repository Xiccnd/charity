package net.cqwu.charity_service.service.impl;

import net.cqwu.charity_commons.pojo.User;
import net.cqwu.charity_dao.mapper.UserDao;
import net.cqwu.charity_service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public Integer insert(User user,String password1) {
        if ( !"".equals(user.getPassword()) && user.getPassword().equals(password1)){
            this.userDao.insert(user);
            return 2;
        }
        return -1;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userDao.deleteById(id) > 0;
    }

    @Override
    public Integer Login(User user) {
        User u = this.userDao.queryByName(user.getName());
        if (u == null) return -1;
        if (!"".equals(user.getPassword()) && !"".equals(u.getPassword()) && user.getPassword().equals(u.getPassword()))
            return u.getPerid();
        return -1;
    }

    @Override
    public User RegistrationVerification(String name) {
        return this.userDao.RegistrationVerification(name);
    }
}