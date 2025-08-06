package com.raven.spring_boot_rabbitmq.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "rabbitmq")
public class RabbitMQProperties {
    private String exchange;
    private DeadLetter deadLetter;
    private GeneralQueue userProfile;
    private GeneralQueue productInventory;
    private GeneralQueue orderProcessing;
    private GeneralQueue systemNotification;

    @Data
    private static class DeadLetter {
        private String exchange;
        private String queueName;
        private String routingKey;
    }

    @Data
    private static class GeneralQueue {
        private String name;
        private String routingKey;
        private Integer priority;
    }
}
