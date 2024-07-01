package com.example.pluralistic.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.example.pluralistic.enums.GenderEnum;
import com.example.pluralistic.enums.UserTypeEnum;

/**
 * @author HEJUNRU
 * @date 2024/07/01
 */
public class User extends Model<User> {


    /**
     *id编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;


    /**
     *姓名
     */
    private String name;


    /**
     *密码
     */
    private String password;

    /**
     *性别
     */
    private GenderEnum gender;

    /**
     *用户类型
     */
    private UserTypeEnum userType;
    /**
     *邮箱
     */
    private String mail;
    /**
     *电话
     */
    private String phone;
    /**
     *头像url
     */
    private String headPortrait;


}
