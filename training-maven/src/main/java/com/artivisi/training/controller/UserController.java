/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artivisi.training.controller;

import com.artivisi.training.domain.SecmanService;
import com.artivisi.training.domain.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author endy
 */
@Controller
public class UserController {
    
    @Autowired private SecmanService secmanService;
    
    @RequestMapping("/user")
    @ResponseBody
    public List<User> cariUser(){
        return secmanService.cariSemuaUser();
    }
}
