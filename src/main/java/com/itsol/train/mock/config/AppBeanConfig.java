package com.itsol.train.mock.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppBeanConfig {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
