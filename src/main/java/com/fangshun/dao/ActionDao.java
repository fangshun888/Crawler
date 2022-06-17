package com.fangshun.dao;

import com.fangshun.entity.Cow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ActionDao {
   private static Logger logger=LoggerFactory.getLogger(ActionDao.class);
   public void eatAction(Cow cow){
       logger.info("在Dao层打印日志"+cow.getName()+"吃饱了");
   }
}
