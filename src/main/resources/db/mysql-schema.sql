drop table if exists `t_user`;

create table `t_user`
(
    `id`           bigint(20) NOT NULL COMMENT '主键',
    `nick_name`    varchar(128)        DEFAULT NULL COMMENT '用户昵称',
    `real_name`    varchar(64)         DEFAULT NULL COMMENT '用户名称',
    `password`     varchar(200)        DEFAULT NULL COMMENT '用户密码',
    `salt`         varchar(500)        DEFAULT NULL COMMENT '加盐',
    `gender`       tinyint(4) NOT NULL DEFAULT '2' COMMENT '性别 0女 1男 2未知',
    `status`       tinyint(4) NOT NULL COMMENT '用户状态（0.禁用 1.正常 2.注销 ）',
    `birthday`     varchar(16)         DEFAULT '' COMMENT '生日',
    `email`        varchar(128)        DEFAULT '' COMMENT '邮箱',
    `address`      varchar(32)         DEFAULT '' COMMENT '地址',
    `photo`        varchar(512)        DEFAULT NULL COMMENT '头像地址',
    `idNumb`       varchar(20)         DEFAULT '' COMMENT '身份证号',
    `creater_time` timestamp           DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `creater_id`   bigint(20)          DEFAULT NULL COMMENT '创建人ID',
    `creater_name` varchar(64)         DEFAULT '' COMMENT '创建人姓名',
    `updater_time` timestamp           DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `updater_id`   bigint(20)          DEFAULT NULL COMMENT '更新人ID',
    `updater_name` varchar(64)         DEFAULT '' COMMENT '更新人姓名',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_bin COMMENT ='用户表';