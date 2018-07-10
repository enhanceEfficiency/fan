package io.github.ee.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * 服务消费者
 *
 * @author dager
 * @date 2018/7/8
 */
@Component
public class ConsumerService{
    /**
     * 注入version=1.0.0对应的服务提供者service
     */
    @Reference(version = "1.0.0")
    UserService userService;

    public String test(String userId){

        String userName = userService.getUserName(userId);
        System.out.println(1);

        return userName;
    }

}
