/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.training.controller;

import com.artivisi.training.domain.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author endy
 */
@Controller
public class UserController {
    
    @RequestMapping("/user")
    @ResponseBody
    public List<User> cariUser(){
        // sementara hardcode dulu
        // nantinya query dari database
        
        List<User> hasil = new ArrayList<User>();
        
        User u = new User();
        u.setUsername("endy");
        u.setEmail("endy@artivisi.com");
        hasil.add(u);
        
        User u1 = new User();
        u1.setUsername("dadang");
        u1.setEmail("dadang@artivisi.com");
        hasil.add(u1);
        
        return hasil;
    }
}
