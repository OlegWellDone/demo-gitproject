/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectSpring.service;

import com.mycompany.projectSpring.domain.FileInfo;
import com.mycompany.projectSpring.domain.User;
import java.util.Collection;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Пользователь
 */
public interface UserService {
    
    Collection<FileInfo> findFiles(String username);
    void createFile(String username, MultipartFile file);
    void deleteUser(User user);
    String getCurrentUsername();
    //UserDetails loadUserByUsername(String username);
}
