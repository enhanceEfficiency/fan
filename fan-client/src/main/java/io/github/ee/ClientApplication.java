package io.github.ee;

import io.github.ee.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费者启动类
 *
 * @author dager
 * @date 2018/7/7
 */
@RestController
@SpringBootApplication
public class ClientApplication {

    @Autowired
    ConsumerService consumerService;

    /**
     * 测试dubbo构建是否成功
     *
     */
    @RequestMapping("/getUserName")
    public String getUserName(@RequestParam("name") String userId) {
        return consumerService.test(userId);
    }


    public static void main( String[] args ) {
        new SpringApplicationBuilder(ClientApplication.class)
                .run(args);
    }
}
