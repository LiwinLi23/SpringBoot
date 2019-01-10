package com.xiaoling.eng.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.Configuration;

@Configuration
@RestController
public class UserController {

    @RequestMapping("/users")
    public String getUserList() {
        return "Get UserList";
    }
}
