package com.zeta;

import java.util.logging.Logger;

public class MyBean {
    private static final Logger logger = Logger.getLogger(String.valueOf(MyBean.class));
    MyBean() {
        logger.info("Creado el MyBean " + System.currentTimeMillis());
    }
}
