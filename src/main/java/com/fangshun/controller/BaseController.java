package com.fangshun.controller;

import com.fangshun.dao.ActionDao;
import com.fangshun.entity.Cow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.fangshun.service.AnimalService;

@RestController
public class BaseController {
    private static Logger logger= LoggerFactory.getLogger(BaseController.class);
    @Autowired
    AnimalService animalService;
    @Autowired
    ActionDao actionDao;
    @GetMapping("/Crawler/test/{name}")
    public String Crawler(@PathVariable String name){
        logger.info("通过Controller打印的name是"+name);
        String result=name+"睡觉了";
        Cow mm=new Cow(name,"x");
        animalService.eat(mm,"草");
        actionDao.eatAction(mm);
        return result;

    }
}
