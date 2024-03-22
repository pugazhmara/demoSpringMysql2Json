package com.example.demo10;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Demo10Dao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public Demo10Dao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> getAllUsers() {
        String sql = "SELECT * FROM batch2";
        return jdbcTemplate.queryForList(sql);
    }
}
