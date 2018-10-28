package com.hjj.boot;

import com.hjj.boot.randomPort.StartCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class BootApplication {

    public static void main(String[] args) {
        new StartCommand(args);
        SpringApplication.run(BootApplication.class, args);
    }
}
