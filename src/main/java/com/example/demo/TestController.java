package com.example.demo;

import com.example.entity.User;
import com.example.entity.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/helloworld")
    public Object helloworld() {
        List<User> users = userMapper.queryProperty();
        return users;
    }
}
