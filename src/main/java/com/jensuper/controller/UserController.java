package com.jensuper.controller;

import com.jensuper.exception.CustomException;
import com.jensuper.model.UserDTO;
import com.jensuper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author jichao
 * @version V1.0
 * @description:
 * @date 2020/04/08
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid UserDTO user) {
        return userService.addUser(user);
    }

    @GetMapping("/customException")
    public String customController() {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            throw new CustomException(1002, "计算错误");
        }
        return "success";
    }

}
