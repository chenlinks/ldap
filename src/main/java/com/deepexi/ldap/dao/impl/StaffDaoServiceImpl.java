package com.deepexi.ldap.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deepexi.ldap.dao.StaffDaoService;
import com.deepexi.ldap.entity.StaffUser;
import com.deepexi.ldap.mapper.StaffUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenling
 * @date 2020/5/11 22:36
 * @since V1.0.0
 */
@Repository
public class StaffDaoServiceImpl extends ServiceImpl<StaffUserMapper, StaffUser> implements StaffDaoService {

    @Autowired
    private  StaffUserMapper staffUserMapper;


    @Override
    public List<StaffUser> getStaff(){
        LambdaQueryWrapper<StaffUser> wrapper = new QueryWrapper<StaffUser>()
                .lambda();
                 wrapper.and(query-> query.isNotNull(StaffUser::getUsername))
                         .and(query-> query.isNotNull(StaffUser::getEmail))
                         .and(query-> query.isNotNull(StaffUser::getPhone))
                         .and(query-> query.isNotNull(StaffUser::getStatus))
                         .and(query-> query.between(StaffUser::getId,1,5))
                        ;
        return list(wrapper);
    }




}
