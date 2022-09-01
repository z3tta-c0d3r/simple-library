package com.zeta;

import com.zeta.service.AuditableService;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Import(AuditableService.class)
public @interface Auditable {
    String group() default "default";
}

