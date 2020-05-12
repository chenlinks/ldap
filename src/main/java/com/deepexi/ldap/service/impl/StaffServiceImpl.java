package com.deepexi.ldap.service.impl;

import com.deepexi.ldap.dao.StaffDaoService;
import com.deepexi.ldap.entity.StaffUser;
import com.deepexi.ldap.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenling
 * @date 2020/5/11 22:35
 * @since V1.0.0
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDaoService staffDaoService;


    @Override
    public List<StaffUser> getStaff(){

        return staffDaoService.getStaff();
    }

}
