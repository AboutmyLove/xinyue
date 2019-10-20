package com.example.xinyue;

import com.example.xinyue.pojo.User;
import com.example.xinyue.service.XinyueServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XinyueApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Autowired
    private XinyueServiceImpl xinyueServiceImpl;

    @Test
    public void show(){
        User user = new User();
        user.setId(1);
        user.setRname("嘿嘿");
        user.setGrname("你好");
        user.setDname("哈哈");
        user.setPhone("465413132");
        user.setName("张三");
        xinyueServiceImpl.insertAppro(user);
    }
}
