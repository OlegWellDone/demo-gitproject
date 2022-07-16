/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectSpring.repository;

import com.mycompany.projectSpring.domain.FileInfo;
import com.mycompany.projectSpring.domain.User;
import java.util.Collection;

/**
 *
 * @author Пользователь
 */
public interface UserRepository{
    
    Collection <FileInfo> findData(String username);
    void save(String username, String path, String name);
}
