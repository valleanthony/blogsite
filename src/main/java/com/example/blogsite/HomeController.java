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

    @RequestMapping("/Template")
    public String template(){
        return "Template";
    }

    @RequestMapping("/usinggit")
    public String usinggit(){
        return "usingGit";
    }

    @RequestMapping("/gitfork")
    public String gitfork(){
        return "gitfork";
    }

    @RequestMapping("/blog2")
    public String blog2(){
        return "blog2";
    }

    @RequestMapping("/introtohtml")
    public String introtohtml(){
        return "introtohtml";
    }

    @RequestMapping("/algos")
    public String introToAlgos(){
        return "algorithm";
    }

    @RequestMapping("/blog1")
    public String github(){
        return "blog1";
    }

    @RequestMapping("/pseudocode")
    public String pse(){
        return "pseudo";
    }

    @RequestMapping("/introbootstrap")
    public String introbootstrap(){
        return "bootstrap";
    }

    @RequestMapping("/blog3")
    public String blog3(){
        return "blog3";
    }



    @RequestMapping("/blog4")
    public String blog4(){
        return "blog4";
    }
}
