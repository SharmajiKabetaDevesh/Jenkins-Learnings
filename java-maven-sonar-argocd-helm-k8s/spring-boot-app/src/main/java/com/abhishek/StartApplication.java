package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Moshi Mosh Everyone,This app is running on Azure Kubernetes Services");
        model.addAttribute("msg", "It took me 13 tries to deploy it using jenkins and argoCd");
        model.addAttribute("msg", "I can't say I have mastered Jenkins,Kubernetes,ArgoCs,SonarQube etc but I have learned to use a part of it.");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
