package com.hand.system.systemmaintenance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hand.system"})
@MapperScan(value = {"com.hand.system.systemmaintenance.mapper"})
public class SystemmaintenanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemmaintenanceApplication.class, args);
    }

}
