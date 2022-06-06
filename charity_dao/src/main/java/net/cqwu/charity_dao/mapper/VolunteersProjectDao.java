package net.cqwu.charity_dao.mapper;

import net.cqwu.charity_commons.pojo.VolunteersProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (VolunteersProject)表数据库访问层
 *
 * @author makejava
 * @since 2022-06-06 16:20:59
 */
@Mapper
public interface VolunteersProjectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VolunteersProject queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VolunteersProject> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param volunteersProject 实例对象
     * @return 对象列表
     */
    List<VolunteersProject> queryAll(VolunteersProject volunteersProject);

    /**
     * 新增数据
     *
     * @param volunteersProject 实例对象
     * @return 影响行数
     */
    int insert(VolunteersProject volunteersProject);

    /**
     * 修改数据
     *
     * @param volunteersProject 实例对象
     * @return 影响行数
     */
    int update(VolunteersProject volunteersProject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}