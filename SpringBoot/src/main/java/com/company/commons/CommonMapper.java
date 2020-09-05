package com.company.commons;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * 定制版MyBatis Mapper插件接口，如需其他接口参考官方文档自行添加。
 */
public interface CommonMapper<T>
        extends BaseMapper<T>,
        ConditionMapper<T>,
        IdsMapper<T>, InsertListMapper<T> {

//    //条件删除，Object必须包含主键字段，但凡方法名包含PrimaryKey的，都要求参数包含主键字段
//    @Override
//    int deleteByPrimaryKey(Object o);
//
//    //根据实体属性作为条件进行删除，个人建议用这个方法
//    @Override
//    int delete(T o);
//
//    //插入一条数据，null的属性也会保存，不会使用数据库默认值
//    @Override
//    int insert(T o);
//
//    //插入一条数据，null的属性不会保存，会使用数据库默认值，个人建议用这个方法
//    @Override
//    int insertSelective(T o);
//
//    //查询一个实体是否存在
//    @Override
//    boolean existsWithPrimaryKey(Object o);
//
//    //查询全部结果
//    @Override
//    List<T> selectAll();
//
//    //查询条件Object必须包含主键属性
//    @Override
//    T selectByPrimaryKey(Object o);
//
//    //查询数据条数
//    @Override
//    public int selectCount(T o);
//
//    //条件查询，返回值是List
//    @Override
//    public List<T> select(T o);
//
//    //条件查询，返回值只能有一个，出现多个会抛异常
//    @Override
//    public T selectOne(T o);
//
//    //条件更新，条件必须包含主键字段，null属性也会被更新到数据库
//    @Override
//    public int updateByPrimaryKey(T o);
//
//    //条件更新，条件必须包含主键字段，null属性不会被更新到数据库，个人建议使用这个方法
//    @Override
//    public int updateByPrimaryKeySelective(T o);

//    //根据Example条件删除数据，关于example的介绍，后文会提到
//    @Override
//    int deleteByExample(Object o);
//
//    //根据Example条件进行查询
//    @Override
//    List<T> selectByExample(Object o);
//
//    //根据Example条件进行查询数据条数
//    @Override
//    int selectCountByExample(Object o);
//
//    //根据Example条件查询，返回值只能有一个，查到多个会抛异常
//    @Override
//    Object selectOneByExample(Object o);
//
//    //根据Example条件进行更新，null属性会被更新到数据库，第一个参数是实体列，第二个参数是Example
//    @Override
//    int updateByExample(Object o, Object o2);
//
//    //同上，区别在于null属性不会被更新到数据库
//    @Override
//    int updateByExampleSelective(Object o, Object o2);
//
//    //Example条件分页查询，RowBounds 是分页参数
//    @Override
//    List<T> selectByExampleAndRowBounds(Object o, RowBounds rowBounds);
//
//    //条件分页查询
//    @Override
//    List<T> selectByRowBounds(Object o, RowBounds rowBounds);
}