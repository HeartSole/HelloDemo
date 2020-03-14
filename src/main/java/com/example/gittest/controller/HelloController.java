package com.example.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiaoXin
 * @date 2020/3/14 下午7:18
 */
@RestController
public class HelloController {
    @GetMapping("/git")
    private String showinfo(){
        return "欢迎使用git！";
    }
}
