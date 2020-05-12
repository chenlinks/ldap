package com.deepexi.ldap.controller;

import com.deepexi.ldap.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenling
 * @date 2020/5/11 23:05
 * @since V1.0.0
 */
@RestController
@RequestMapping("/api/v1/person")
public class PersonController {


    @Autowired
    private PersonService personService;


    @GetMapping
    public  boolean createPerson(){
        return personService.addPerson();
    }




}
