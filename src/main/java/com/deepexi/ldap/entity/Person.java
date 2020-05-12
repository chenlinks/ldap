package com.deepexi.ldap.entity;

import lombok.Data;
import org.springframework.ldap.odm.annotations.*;

import javax.naming.Name;

/**
 * @author chenling
 * @date 2020/5/12 0:05
 * @since V1.0.0
 */
@Data
@Entry(base = "dc=com",objectClasses = { "dcObject", "organization", "top"})
public class Person {

    @Id
    private Name dn;

    @Attribute(name = "cn")
    @DnAttribute(value = "cn", index = 2)
    private String fullName;

    @Attribute(name = "sn")
    private String lastName;

    @Attribute(name = "description")
    private String description;


    @Attribute(name = "o")
    private String company;

    @Attribute(name = "email")
    private String email;


    @Attribute(name = "employeeNumber")
    private String usernumber;

    @Attribute(name = "userPassword")
    private String password;

    @Attribute(name = "dc")
    private String domain;

}
