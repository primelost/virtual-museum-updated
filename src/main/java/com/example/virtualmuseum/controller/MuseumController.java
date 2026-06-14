package com.example.virtualmuseum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MuseumController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Виртуальный музей: Русь XIII–XV вв.");
        return "index";
    }

    @GetMapping("/tour1")
    public String tour1(Model model) {
        model.addAttribute("title", "Экскурсия 1: Русь и Золотая Орда");
        return "tour1";
    }

    @GetMapping("/tour2")
    public String tour2(Model model) {
        model.addAttribute("title", "Экскурсия 2: Подъём Москвы и конец ига");
        return "tour2";
    }

    @GetMapping("/tour3")
    public String tour3(Model model) {
        model.addAttribute("title", "Экскурсия 3: Духовная Русь и Андрей Рублёв");
        return "tour3";
    }
}
