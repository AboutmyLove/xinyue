package com.example.xinyue.test;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: xinyue
 * @Package: com.example.xinyue.test
 * @ClassName: TestLintner
 * @Author: zht19
 * @Description:
 * @Date: 2019/10/17 21:58
 * @Version: 1.0
 */
@Component
public class TestLintner {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "test.queue", durable = "true"),
            exchange = @Exchange(
                    value = "test.exchange",
                    ignoreDeclarationExceptions = "true",
                    type = ExchangeTypes.TOPIC
            ),
            key = {"#.#"}))
    public void show(String massage){
        System.out.println(massage);
    }
}
