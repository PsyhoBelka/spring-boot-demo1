package ua.rozhkov.springbootdemo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {

    @RequestMapping("/")
    public String showMainPage(Model model) {
        String test = "test-string";
        model.addAttribute("test", test);
        return "mainPage";
    }
}
