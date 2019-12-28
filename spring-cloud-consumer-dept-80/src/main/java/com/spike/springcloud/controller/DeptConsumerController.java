package com.spike.springcloud.controller;

import com.spike.springcloud.api.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.support.HttpRequestWrapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable("id")Long id){
        System.out.println("id = " + id);
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        System.out.println(dept.getDname());
        // todo dept参数传不到服务端
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept.getDname(),Boolean.class,MediaType.APPLICATION_JSON_UTF8_VALUE);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> getAllDepts(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }
}
