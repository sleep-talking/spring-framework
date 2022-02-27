package com.study.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Khuqic
 * @version 1.0
 * @date 2022/2/27 13:07
 * @description
 */
@Configuration
@ComponentScan
public class UserConfig {

    @Bean
    public User getUserInstance() {
        return new User(1,"小明");
    }
}
