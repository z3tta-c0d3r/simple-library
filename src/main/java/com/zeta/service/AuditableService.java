package com.zeta.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;

import java.util.logging.Logger;

@ComponentScan
@ConditionalOnProperty(value = "com.zeta.config.enabled",havingValue = "true",matchIfMissing = true)
public class AuditableService {
    private static final Logger logger = Logger.getLogger(String.valueOf(AuditableService.class));

    public String group(String data) {
        logger.info("Valor del data:" + data);
        return "Valor del data:" + data;
    }
}
