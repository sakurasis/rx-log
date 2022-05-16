package io.infinity.domain.po;

import io.infinity.domain.BaseEntity;
import lombok.*;

/**
 * @author sakurayang
 * @function 用户信息（用户注册、登录【权限】）
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户真实名称
     */
    private String realName;

    /**
     * 密码
     */
    private String password;

    /**
     * 加盐
     */
    private String salt;

    /**
     * 用户状态（0.禁用 1.正常 2.注销 ）
     */
    private Integer status;

    /**
     * 地址
     */
    private String address;

    /**
     * 性别 0: 男; 1:女;
     */
    private Integer gender;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 身份证号
     */
    private String idNumb;
}

