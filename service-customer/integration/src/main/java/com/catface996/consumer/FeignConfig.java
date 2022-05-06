package com.catface996.consumer;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author by 大猫
 * @date 2022/5/6 13:45 catface996 出品
 */
@Configuration
@EnableFeignClients(value = {"com.catface996.provider.api"})
public class FeignConfig {
}
