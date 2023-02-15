package com.belajarspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.belajarspringboot.entity.Guru;
import com.belajarspringboot.service.GuruService;

@Controller
@RequestMapping
public class HomeController {

    @Autowired
    private GuruService guruService;

    @GetMapping("/")
    public String guru(Model model){

        model.addAttribute("guruu", guruService.findAlList());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("guruu", new Guru());
        return "add";
    }

    @PostMapping("/save")
    public String save(Guru guru , Model model) {
        guruService.addGuru(guru);
        return "redirect:/";
    }

    @GetMapping("/delete/{nip}")
    public String delete(@PathVariable("nip") Long nip){
        guruService.deleteById(nip);
        return "redirect:/";
    }

    @GetMapping("/edit/{nip}")
    public String delete(@PathVariable("nip") Long nip, Model model){
        model.addAttribute("guruu", guruService.findByID(nip));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Guru guru, Model model) {
        guruService.updateGuru(guru);
        return "redirect:/";
    }
    
}
