package com.example.blogsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "blog";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/profile")
    public String profile() {
        return "profile";
    }

    @RequestMapping("/Template")
    public String template() {
        return "Template";
    }

    @RequestMapping("/usinggit")
    public String usinggit() {
        return "usingGit";
    }

    @RequestMapping("/gitfork")
    public String gitfork() {
        return "gitfork";
    }
    @RequestMapping("/gitfork-2")
    public String gitfork2() {
        return "gitfork-2";
    }
    @RequestMapping("/blog2")
    public String blog2() {
        return "blog2";
    }@RequestMapping("/blog2-1")
    public String blog21() {
        return "blog2-1";
    }
    @RequestMapping("/blog3")
    public String blog3() {
        return "blog3";
    }
    @RequestMapping("/blog3-1")
    public String blog31() {
        return "blog3-1";
    }
    @RequestMapping("/blog4")
    public String blog4() {
        return "blog4";
    }
    @RequestMapping("/blog4-1")
    public String blog41() {
        return "blog4-1";
    }

}
