package io.github.ee;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 消费服务提供者启动类
 *
 * @author dager
 * @date 2018/7/7
 */

@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ProviderApplication.class)
                .run(args);

    }
}
