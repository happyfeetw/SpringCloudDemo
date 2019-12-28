package com.spike.springcloud.dao;

import com.spike.springcloud.api.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DeptMapper {

    boolean addDept(Dept dept);

    Dept queryById(Long Id);

    List<Dept> queryAll();

}
