package com.example.demo10;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Demo10Controller {

    private final Demo10Dao demo10Dao;

    @Autowired
    public Demo10Controller(Demo10Dao demo10Dao) {
        this.demo10Dao = demo10Dao;
    }

    @GetMapping("/user")
    public List<Map<String, Object>> hello() {
        return demo10Dao.getAllUsers();
    }
}
