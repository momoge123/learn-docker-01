package com.atguigu.docker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
  * @auther zzyy
  * @create 2021-10-25 17:43
  */
@RestController
public class OrderController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/order/docker")
    public String HelloDocker(){
        return "hello docker"+"\t"+ port + "\t"+ UUID.randomUUID().toString();
    }

    @RequestMapping(value ="/order/index",method = RequestMethod.GET)
    public String index(){
        System.out.println("====服务端口号=======");
        System.out.println("====hot-fix=======");
        System.out.println("====hot-fix==222=====");
        return "服务端口号: "+"\t"+ port + "\t"+ UUID.randomUUID().toString();
    }
}