package com.hjj.boot.controller;

import com.hjj.boot.async.AsyncService;
import com.hjj.boot.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Environment env;

    @Autowired
    private MyConfig config;

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/hello")
    public String hello() {
        return env.getProperty("server.port");
    }

    @GetMapping("/config")
    public String config() {
        return config.getName();
    }

    @GetMapping("/async")
    public String hello1() {
        System.out.println(Thread.currentThread().getName());
        asyncService.toPrintLog();
        return "ok";
    }

    @GetMapping("/nc-this")
    public String ncThis() {
        System.out.println(Thread.currentThread().getName());
        asyncService.toInvokeThisAsync();
        return "ok";
    }
}
