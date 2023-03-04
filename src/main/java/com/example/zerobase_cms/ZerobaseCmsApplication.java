package com.example.zerobase_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableFeignClients
@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
public class ZerobaseCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZerobaseCmsApplication.class, args);
    }

}

/*
spring.mvc.pathmatch.matching-strategy=ant_path_matcher
feign.okhttp.enabled=true

spring.datasource.url=jdbc:mysql://localhost.com:3306/localhost
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=1234

spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create
 */