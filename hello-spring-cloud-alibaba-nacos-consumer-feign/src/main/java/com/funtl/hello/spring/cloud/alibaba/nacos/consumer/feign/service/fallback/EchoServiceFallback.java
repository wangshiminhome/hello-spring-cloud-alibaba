package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @name: EchoServiceFallback
 * @Author: wangshimin
 * @Date: 2019-04-01  21:22
 * @Description:
 */
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String message) {
        return "加载失败，请重试";
    }
}