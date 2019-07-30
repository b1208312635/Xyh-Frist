package com.evan.xyh.Controller;

import com.evan.xyh.Bean.User;
import com.evan.xyh.Result.Result;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@RestController
public class LoginController {

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        String message = "";
        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
            message = "账号密码错误";
            System.out.println("test");
            return new Result(400, message);
        } else {
            message = "登陆成功";
            return new Result(200, message);
        }
    }
}
