/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectSpring.repository;

import com.mycompany.projectSpring.domain.FileInfo;
import com.mycompany.projectSpring.domain.User;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Пользователь
 */

@Repository
public class UserJdbcRepository implements UserRepository {
    
    private final JdbcTemplate jdbcTemplate;
    
    
    @Autowired
    public UserJdbcRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Collection<FileInfo> findData(String username) {
        return jdbcTemplate.query("SELECT * FROM users WHERE username = " + username,
                (rs, rowNum) -> (new FileInfo(rs.getString("name"), rs.getString("username"), rs.getString("path"))));
    }

    @Override
    public void save(String username, String path, String name) {
        jdbcTemplate.execute("INSERT INTO users (username, file, name) VALUES("+ username+" ," + path + "," + name + ");");
        
    }

}
