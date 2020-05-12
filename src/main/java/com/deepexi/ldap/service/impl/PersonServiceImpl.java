package com.deepexi.ldap.service.impl;

import com.deepexi.ldap.dao.PersonRepoService;
import com.deepexi.ldap.entity.Person;
import com.deepexi.ldap.entity.StaffUser;
import com.deepexi.ldap.service.PersonService;
import com.deepexi.ldap.service.StaffService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.support.LdapNameBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.naming.Name;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenling
 * @date 2020/5/11 22:48
 * @since V1.0.0
 */
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {


    @Autowired
    private StaffService staffService;

    @Autowired
    private PersonRepoService personRepoService;


    @Override
    public Boolean addPerson() {

        List<StaffUser> staff = staffService.getStaff();
        log.info("用户数据：{}",staff);

        List<Person> people = new ArrayList<>();
        if(!CollectionUtils.isEmpty(staff)){
            for (StaffUser staffUser : staff) {
                Person person = new Person();
                person.setDescription("deepexi 员工");
                person.setLastName(staffUser.getUsername());
                person.setCompany("deepexi");
//                person.setEmail(staffUser.getEmail());
//                person.setStatus(staffUser.getStatus());
                person.setPassword(staffUser.getPassword());
                person.setFullName("北京迪普科技");
                person.setDomain("com");
                people.add(person);
            }

            return  personRepoService.create(people);
        }
        return false;
    }


    private Attributes getAttributes(String ou,String parent){
        Attributes attrs = new BasicAttributes();
        Attribute oattr = new BasicAttribute("objectclass");
        oattr.add("top");
        oattr.add("OrganizationalUnit");
        attrs.put(oattr);
        attrs.put("ou",ou);
        return attrs;
    }

    private Name getDn(String ou ,String parent){
        Name dn = LdapNameBuilder.newInstance(parent).add("ou", ou).build();
        return dn;
    }
}
