package com.deepexi.ldap.service;

import com.deepexi.ldap.entity.StaffUser;

import java.util.List;

/**
 * @author chenling
 * @date 2020/5/11 22:35
 * @since V1.0.0
 */
public interface StaffService {


    List<StaffUser> getStaff();
}
