package com.example.blogsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/blog")
    public String blog(){
        return "blog";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/profile")
        public String profile(){
            return "profile";
        }



}
