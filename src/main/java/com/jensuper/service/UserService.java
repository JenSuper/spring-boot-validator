package com.jensuper.service;

import com.jensuper.model.UserDTO;
import org.springframework.stereotype.Service;

/**
 * @author jichao
 * @version V1.0
 * @description:
 * @date 2020/04/08
 */
@Service
public class UserService {

    public String addUser(UserDTO user) {
        System.out.println(user);
        // 直接编写业务逻辑
        return "success";
    }
}
