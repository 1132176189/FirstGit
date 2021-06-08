package com.yt.local.controller;

import com.yt.local.entity.UserEntity;
import com.yt.local.resposity.IndexResposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private IndexResposity indexResposity;

    @RequestMapping("/index")
    public String index(){
        return "success";
    }
    @GetMapping("saveUser")
    public String saveUser(){
        LocalDateTime localDateTime =LocalDateTime.now();
        List<UserEntity>list =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserEntity userEntity = new UserEntity();
            userEntity.setUserId(i);
            userEntity.setUserName("name"+i);
            userEntity.setUserAddr("userAddr"+i);
            userEntity.setAddDate(localDateTime);
            list.add(userEntity);
        }
        indexResposity.saveAll(list);
        return "success";
    }
    @RequestMapping("/truncate")
    public String truncateTable(){
        indexResposity.deleteData();
        return "truncate success";
    }
}
