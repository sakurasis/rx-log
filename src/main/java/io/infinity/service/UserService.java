package io.infinity.service;

import com.google.inject.ImplementedBy;
import io.infinity.domain.po.User;
import io.infinity.service.impl.UserServiceImpl;

/**
 * @author admin
 * @version 2.0
 * @date 2022/5/16 18:20
 * @description UserService
 * @since 12.25
 */
@ImplementedBy(UserServiceImpl.class)
public interface UserService {
    /**
     * 根据
     * @param id
     * @return
     */
    User getUserInfoById(Long id);


}
