package com.zeta.configuration;

import com.zeta.SharedData;
import com.zeta.SharedDataInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SharedDataConfig {


    @Bean
    public SharedData sharedData() {
        return new SharedData();
    }

    @Bean
    public SharedDataInterceptor sharedDataInterceptor(SharedData sharedData) {
        return new SharedDataInterceptor(sharedData);
    }
}
