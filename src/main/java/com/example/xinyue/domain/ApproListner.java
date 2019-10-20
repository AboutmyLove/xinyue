package com.example.xinyue.domain;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: xinyue
 * @Package: com.example.xinyue.domain
 * @ClassName: ApproListner
 * @Author: zht19
 * @Description:
 * @Date: 2019/10/17 17:37
 * @Version: 1.0
 */
@Component
public class ApproListner {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "spring.test.queue", durable = "true"),
            exchange = @Exchange(
                    value = "spring.test.exchange",
                    ignoreDeclarationExceptions = "true",
                    type = ExchangeTypes.TOPIC
            ),
            key = {"test.rout"}))
    public void refreshAll(Integer id){
        if(id == null){
            return ;
        }
    }
}
