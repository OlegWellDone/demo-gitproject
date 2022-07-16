/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectSpring.controller;

import com.mycompany.projectSpring.domain.FileInfo;
import com.mycompany.projectSpring.domain.User;
import com.mycompany.projectSpring.service.UserService;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Пользователь
 */

@RestController
@RequestMapping("/users")
public class UserController {
    
    public Collection<FileInfo> files;
    private final UserService userService;
    
    @Autowired
    public UserController (UserService userService){
        this.userService = userService;
    }
    
    @GetMapping
    @RequestMapping("/getfiles")
    public Collection <FileInfo> getFiles(String username){
        files.addAll(userService.findFiles(username));
        return files;
    }
    
    @PostMapping
    @RequestMapping("/addfiles/{username}")
    public void addFile(@PathVariable String username, MultipartFile file){
        userService.createFile(username, file);//сохранять файл в отдельной папке, в бд отправлять путь и имя файла прикрепленного к пользователю
        
    }
    
    @GetMapping
    @RequestMapping("/username")
    public String getUsername(){
        return userService.getCurrentUsername();
    }
}
