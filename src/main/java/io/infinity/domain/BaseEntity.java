package io.infinity.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * @author sakurayang
 * @description 数据库通用实体
 * @date 2022-05-14 15:08
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1126589596707365459L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 创建者id
     */
    private Long createrId;

    /**
     * 创建者名称
     */
    private String createrName;

    /**
     * 更新者id
     */
    private Long updaterId;

    /**
     * 更新者名称
     */
    private String updaterName;

    /**
     * 创建时间
     */
    private LocalDateTime createrTime;

    /**
     * 更新时间
     */
    private LocalDateTime updaterTime;

    /**
     * 是否逻辑删除 0:已删除, 1:未删除
     */
    private Boolean isDelete;
}
