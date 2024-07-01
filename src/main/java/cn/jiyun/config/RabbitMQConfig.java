package cn.jiyun.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    //交换机
    public static final String ITEM_TOPIC_EXCHANGE = "item_topic_exchange";
    //队列
    public static final String ITEM_QUEUE = "item_queue";

    @Bean("itemTopicExchange")
    public Exchange topicExchange(){
        return ExchangeBuilder.topicExchange(ITEM_TOPIC_EXCHANGE).durable(true).build();
    }

    @Bean("itemQueue")
    public Queue itemQueue() {
        return QueueBuilder.durable(ITEM_QUEUE).build();
    }

    @Bean
    public Binding itemQueueExchange(@Qualifier("itemQueue") Queue queue, @Qualifier("itemTopicExchange")Exchange exchange){
                                                                         //消息通配符
        return BindingBuilder.bind(queue).to(exchange).with("item.#").noargs();
    }
}
