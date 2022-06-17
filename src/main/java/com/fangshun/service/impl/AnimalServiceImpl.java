package com.fangshun.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fangshun.service.AnimalService;
import org.springframework.stereotype.Component;

@Component
public class AnimalServiceImpl implements AnimalService {
     static Logger logger= LoggerFactory.getLogger(AnimalServiceImpl.class);
    @Override
    public void eat(Object o, String fool) {
        logger.info("一只"+o.getClass().getSimpleName()+"正在吃"+fool);

    }
}
