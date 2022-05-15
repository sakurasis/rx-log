package io.infinity.mapper;

import io.infinity.domain.User;

/**
 * @author sakura
 * @descprition
 * @function UserMapper
 * @date 2022/5/15 23:02
 */
public interface UserMapper {

    User selectById(Long id);
}
