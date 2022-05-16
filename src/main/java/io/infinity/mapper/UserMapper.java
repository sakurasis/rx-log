package io.infinity.mapper;

import io.infinity.domain.po.User;

import java.util.List;

/**
 * @author sakura
 * @descprition
 * @function UserMapper
 * @date 2022/5/15 23:02
 */
public interface UserMapper {

    /**
     * 根据用户id查询用户详情
     *
     * @param id 用户id
     * @return {@link User}
     */
    User selectById(Long id);

    /**
     * 根据用户名称查询用户列表
     *
     * @param name 用户名称
     * @return      {@link java.util.List}
     */
    List<User> selectByName(String name);

    /**
     * 新增用户
     * @param user 用户信息
     * @return {@link java.lang.Boolean}
     */
    Boolean insertUserById(User user);
}
