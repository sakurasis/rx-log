package io.infinity.service.impl;

import com.google.inject.Inject;
import io.infinity.domain.po.User;
import io.infinity.mapper.UserMapper;
import io.infinity.service.UserService;

/**
 * @author admin
 * @version 2.0
 * @date 2022/5/16 18:21
 * @description UserServiceImpl
 * @since 12.25
 */
public class UserServiceImpl implements UserService {

    @Inject
    private UserMapper userMapper;

    @Override
    public User getUserInfoById(Long id) {
        return this.userMapper.selectById(id);
    }
}
