package com.deepexi.ldap.dao.impl;

import com.deepexi.ldap.dao.PersonRepoService;
import com.deepexi.ldap.entity.Person;
import com.deepexi.ldap.entity.StaffUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.stereotype.Repository;

import javax.naming.Name;
import java.util.List;
import java.util.Optional;

/**
 * @author chenling
 * @date 2020/5/11 22:29
 * @since V1.0.0
 */
@Repository
@Slf4j
public class PersonRepoServiceImpl implements PersonRepoService {


    @Autowired
    private LdapTemplate ldapTemplate;




    @Override
    public Boolean create(List<Person> person) {
        person.forEach(staffUser -> ldapTemplate.create(staffUser));
        log.info("新增数据成功！");
        return true;
    }


}
