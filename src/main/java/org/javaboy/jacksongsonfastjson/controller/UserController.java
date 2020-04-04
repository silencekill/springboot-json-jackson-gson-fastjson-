package org.javaboy.jacksongsonfastjson.controller;

import org.javaboy.jacksongsonfastjson.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("get")
    public List<User> get(){
        ArrayList<User> users = new ArrayList<>();
        for(int i=0;i<5;i++){
            users.add(new User(i,"123"+i,new Date()));
        }
        return users;
    }
}
