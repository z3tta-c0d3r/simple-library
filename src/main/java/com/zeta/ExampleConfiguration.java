package com.zeta;

import com.zeta.service.AuditableService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
@ComponentScan
@ConditionalOnProperty(value = "com.zeta.config.enabled",havingValue = "true",matchIfMissing = true)
public class ExampleConfiguration {
    // Create your Bean definitions here e.g.
    private static final Logger logger = Logger.getLogger(String.valueOf(ExampleConfiguration.class));
    @Bean
    public MyBean myBean() {
        logger.info("ExampleConfiguration - Creado el MyBean " + System.currentTimeMillis());
        return new MyBean();
    }

    @Bean
    public AuditableService auditableService() {
        logger.info("ExampleConfiguration - Creado el AuditableService " + System.currentTimeMillis());
        return new AuditableService();
    }
}
