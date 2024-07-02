package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class testController {
        @GetMapping("/")
        public String VersionUpdateTest(){
            return "version 1.0";
        }


}
