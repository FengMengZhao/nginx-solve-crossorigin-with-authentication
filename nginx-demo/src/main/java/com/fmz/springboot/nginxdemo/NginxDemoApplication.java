package com.fmz.springboot.nginxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class NginxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NginxDemoApplication.class, args);
    }

}
