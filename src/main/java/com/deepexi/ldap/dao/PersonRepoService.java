package com.deepexi.ldap.dao;

import com.deepexi.ldap.entity.Person;
import java.util.List;

/**
 * @author chenling
 * @date 2020/5/11 22:28
 * @since V1.0.0
 */
public interface PersonRepoService {


    Boolean create(List<Person> person);

}
