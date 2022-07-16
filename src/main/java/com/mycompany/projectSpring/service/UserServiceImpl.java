/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectSpring.service;

import com.mycompany.projectSpring.domain.FileInfo;
import com.mycompany.projectSpring.domain.User;
import com.mycompany.projectSpring.repository.UserRepository;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Пользователь
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    

    @Override
    public void createFile(String username, MultipartFile file) {
        String pathToFile;
        try {
            file.transferTo(new File("/"+ username + "/files/" + file.getName()));
            pathToFile = "/" + username + "/files/" + file.getName();
            userRepository.save(username, pathToFile, file.getName());
        } catch (IOException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(UserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void deleteUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<FileInfo> findFiles(String username) {
        return userRepository.findData(username);
    }
    
    @Override
    public String getCurrentUsername() {
      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
      return auth.getName();
  }
}
