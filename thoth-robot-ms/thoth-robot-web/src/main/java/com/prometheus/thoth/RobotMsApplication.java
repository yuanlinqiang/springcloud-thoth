package com.prometheus.thoth;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by sunliangliang
 */

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class RobotMsApplication{

    public static void main(String[] args) {
       SpringApplication.run(RobotMsApplication.class, args);
    }
}