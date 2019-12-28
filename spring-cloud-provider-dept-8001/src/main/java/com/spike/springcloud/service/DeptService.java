package com.spike.springcloud.service;

import com.spike.springcloud.api.entity.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);
    Dept queryById(Long id);
    List<Dept> queryAll();
}
