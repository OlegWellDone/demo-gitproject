/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectSpring.domain;

/**
 *
 * @author Пользователь
 */
public class FileInfo {
 private String owner;
 private String pathToFile;
 private String nameOfFile;
 
 public FileInfo(){
 }
 
 public FileInfo(String nameOfFile, String owner, String pathToFile){
     this.nameOfFile = nameOfFile;
     this.owner = owner;
     this.pathToFile = pathToFile;
 }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }
 
 
 
 
}
