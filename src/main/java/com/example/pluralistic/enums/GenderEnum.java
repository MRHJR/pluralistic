package com.example.pluralistic.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author HEJUNRU
 * @since 2024/07/01
 */
@Getter
@AllArgsConstructor
public enum GenderEnum {

    /**
     *性别
     */
    MAN(0, "男"),
    GIRL(1, "女"),
    ;


    /**
     * 类型（存放数据库的值）
     */
    @EnumValue
    private final Integer value;
    /**
     * 描述（返回给前端的值）
     */
    @JsonValue
    private final String description;
}
