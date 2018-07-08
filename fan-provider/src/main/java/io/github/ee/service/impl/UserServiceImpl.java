package io.github.ee.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import io.github.ee.service.UserService;

/**
 * 用户服务实现类（服务提供者接口实现类）
 *
 * @author dager
 * @date 2018/7/7
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String userId) {
        return "dager"+userId;
    }
}
