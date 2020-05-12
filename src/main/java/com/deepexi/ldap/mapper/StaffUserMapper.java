package com.deepexi.ldap.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.ldap.entity.StaffUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author chenling
 * @date 2020/5/11 22:41
 * @since V1.0.0
 */
@Mapper
public interface StaffUserMapper extends BaseMapper<StaffUser> {


    List<StaffUser> getUserList();




}
