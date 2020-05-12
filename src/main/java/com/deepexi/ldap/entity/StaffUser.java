package com.deepexi.ldap.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

import javax.naming.Name;
import java.util.Date;

/**
 * @author chenling
 * @date 2020/5/11 22:40
 * @since V1.0.0
 */
@Data
@TableName("account_account_info")
public class StaffUser {


    private Long id;

    /**
     * 企业ID
     */
    private String enterpriseCode;

    /**
     * 账号名字
     */
    @TableField(strategy = FieldStrategy.NOT_EMPTY)
    private String username;

    /**
     * 密码
     */
    @TableField(strategy = FieldStrategy.NOT_EMPTY)
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 账号类型
     */
    private Long accountTypeId;

    /**
     * 账号状态
     */
    private Integer status;


}
