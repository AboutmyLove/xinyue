package com.example.xinyue.service;

import com.example.xinyue.pojo.User;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: xinyue
 * @Package: com.example.xinyue.service
 * @ClassName: XinyueService
 * @Author: zht19
 * @Description:
 * @Date: 2019/10/17 16:22
 * @Version: 1.0
 */
@Service
public class XinyueServiceImpl implements XinyueService{

    @Resource
    private AmqpTemplate rabbitTemplate;
    @Override
    public void insertAppro(User user) {
        List list = new ArrayList<User>();
        list.add(user);
        //  进行添加操作
       if(list != null){
           sendMassage(user.getId());
        }
    }
    private void sendMassage(Integer id){
        try {
            rabbitTemplate.convertAndSend("spring.test.exchange","test.rout",id);
        } catch (AmqpException e) {
            System.out.println("审核消息发送异常");
        }
    }
}
