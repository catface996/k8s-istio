package com.catface996.consumer;

import com.catface996.common.util.EnvUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author by catface
 * @date 2020/12/13
 */
@Slf4j
@SpringBootApplication(
    scanBasePackages = {"com.catface996"}
)
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        log.info("ConsumerApplication start success!");
        System.out.println("ConsumerApplication start success!");
        System.out.println(EnvUtil.getSwaggerUrl());
        System.out.println(EnvUtil.getDocUrl());
    }
}
