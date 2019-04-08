package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @name: NacosConsumerConfiguration
 * @Author: wangshimin
 * @Date: 2019-04-01  20:47
 * @Description:
 */
@Configuration
public class NacosConsumerConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}