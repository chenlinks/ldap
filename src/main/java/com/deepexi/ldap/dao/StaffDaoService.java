package com.deepexi.ldap.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.deepexi.ldap.entity.StaffUser;

import java.util.List;

/**
 * @author chenling
 * @date 2020/5/11 22:36
 * @since V1.0.0
 */
public interface StaffDaoService  extends IService<StaffUser> {

    List<StaffUser> getStaff();
}
