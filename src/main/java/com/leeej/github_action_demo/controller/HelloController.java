package com.leeej.github_action_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "수정도 잘 되나요..🚩🚩🚩🚩🚩🚩🚩";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
