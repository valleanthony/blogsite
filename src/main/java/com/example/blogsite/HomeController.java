package com.example.blogsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/profile")
    public String profile() {
        return "profile";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "blog";
    }

    @RequestMapping("/blog1")
    public String blog1() {
        return "blog1";
    }
    @RequestMapping("/blog1-1")
    public String blog11() {
        return "blog1-1";
    }

    @RequestMapping("/blog2")
    public String blog2(){

        return "blog2";
    }
    @RequestMapping("/blog2-1")
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

    @RequestMapping("/blog5")
    public String blog5() {
        return "blog5";
    }
    @RequestMapping("/blog5-1")
    public String blog51() {
        return "blog5-1";
    }

    @RequestMapping("/usinggit")
    public String usinggit() {
        return "usingGit";
    }

    @RequestMapping("/gitfork")
    public String gitfork() {
        return "gitfork";
    }

    @RequestMapping("/introtohtml")
    public String introtohtml() {
        return "introtohtml";
    }

    @RequestMapping("/algos")
    public String introToAlgos() {
        return "algorithm";
    }


    @RequestMapping("/pseudocode")
    public String pse() {
        return "pseudo";
    }

    @RequestMapping("/introbootstrap")
    public String introbootstrap() {
        return "bootstrap";
    }


}
