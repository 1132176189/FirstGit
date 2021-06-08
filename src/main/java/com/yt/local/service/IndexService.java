package com.yt.local.service;

import com.mysql.cj.jdbc.JdbcStatement;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IndexService {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public void saveUser(){


    }
}
