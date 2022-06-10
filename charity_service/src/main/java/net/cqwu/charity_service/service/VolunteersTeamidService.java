package net.cqwu.charity_service.service;

import net.cqwu.charity_commons.pojo.VolunteersTeamid;
import java.util.List;

/**
 * (VolunteersTeamid)表服务接口
 *
 * @author makejava
 * @since 2022-06-06 16:32:57
 */
public interface VolunteersTeamidService {

    /**
     * 通过ID查询单条数据
     *
     * @param  id 主键
     * @return 实例对象
     */
    VolunteersTeamid queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteersTeamid> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param volunteersTeamid 实例对象
     * @return 实例对象
     */
    VolunteersTeamid insert(VolunteersTeamid volunteersTeamid);

    /**
     * 修改数据
     *
     * @param volunteersTeamid 实例对象
     * @return 实例对象
     */
    VolunteersTeamid update(VolunteersTeamid volunteersTeamid);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    List<VolunteersTeamid> queryAll(VolunteersTeamid volunteersTeamid);
}