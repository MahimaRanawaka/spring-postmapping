package com.example.demo1.controller;

import com.example.demo1.DTO.UserDTO;
import com.example.demo1.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/user ")
public class UserController {
@Autowired
private UserServise userServise;
    @GetMapping("/getUser")
    public String getUser(){
        return "Simple root";
    }
    @PostMapping("/saveUser")
        public UserDTO saveUser(@RequestBody UserDTO userDTO){
          return userServise.saveUser(userDTO);
        }
   @PutMapping("/updateUser")
         public String updateUser(){
             return "Simple root";
            }
    @DeleteMapping("/deleteUser")
    public String deleteUser(){
             return "Simple root";
            }
        }



