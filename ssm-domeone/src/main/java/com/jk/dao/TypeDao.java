package com.jk.dao;

import com.jk.model.T_Type;
import java.util.List;

public interface TypeDao {
    int deleteByPrimaryKey(String typeid);

    int insert(T_Type record);

    int insertSelective(T_Type record);

    T_Type selectByPrimaryKey(String typeid);

    int updateByPrimaryKeySelective(T_Type record);

    int updateByPrimaryKey(T_Type record);

    List<T_Type> querytype();
}