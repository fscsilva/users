package com.tenantevaluation.training.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.tenantevaluation.training.users.adapter.persistence.model")
@EnableJpaRepositories(basePackages = "com.tenantevaluation.training.users.adapter.persistence.repository")
public class UsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
    }

}
