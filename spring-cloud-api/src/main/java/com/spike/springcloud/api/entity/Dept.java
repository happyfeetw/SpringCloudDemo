package com.spike.springcloud.api.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true) //支持链式编程
/*
链式编程写法：
    Dept dept = new Dept();
    dept.setDeptno()
        .setDname()
        .setDb_source();
不开启则只能
    dept.setDeptno();
    dept.setDname();
    dept.setDb_source();
 */
public class Dept implements Serializable {

    private static final long serialVersionUID = 1710939928072668378L;

    /**
     * 部门编号
     */
    private Long depno;

    /**
     * 部门名称
     */
    private String dname;
    /**
     * 数据所在的数据库
     * 微服务架构下，每个服务都有自己的数据库
     * 并且同一个信息会被不同的服务存在不同的数据库内
     */
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
