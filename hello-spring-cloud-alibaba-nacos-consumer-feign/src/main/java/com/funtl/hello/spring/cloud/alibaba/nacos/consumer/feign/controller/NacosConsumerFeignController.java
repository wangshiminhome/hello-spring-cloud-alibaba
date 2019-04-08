package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name: NacosConsumerFeignController
 * @Author: wangshimin
 * @Date: 2019-04-01  21:05
 * @Description:
 */
@RestController
public class NacosConsumerFeignController {

    @Autowired
    private EchoService echoService;

    @RestController
    public class EchoController {
        @GetMapping(value = "/echo/{message}")
        public String echo(@PathVariable String message) {
            return echoService.echo(message);
        }
    }
}