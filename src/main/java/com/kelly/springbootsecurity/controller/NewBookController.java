package com.kelly.springbootsecurity.controller;

import com.kelly.springbootsecurity.model.NewBook;
import com.kelly.springbootsecurity.service.NewBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NewBookController {
    @Autowired
    private NewBookService newBookService;

    @PostMapping("/doUpdateNewBook")
    public String doUpdateNewBook(NewBook entity){
        newBookService.updateNewBook(entity);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public String doFindById(@PathVariable Integer id, Model model){
        NewBook newBook = newBookService.findById(id);
        model.addAttribute("n", newBook);
        return "newBook_update";
    }

    @RequestMapping("/doSaveNewBook")
    public String doSaveNewBook (NewBook entity) {
        newBookService.saveNewBook(entity);
        return "redirect:/";
    }

    @RequestMapping("/new")
    public String doNewBookAddUI(){
        return "newBook_adds";
    }

    @RequestMapping("/delete/{id}")
    public String doDeleteById (@PathVariable Integer id) {
        newBookService.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping("/")
    public String doNewBookUI(Model model){
        List<NewBook> newBookList=newBookService.findNewBook();
        model.addAttribute("NewBookList", newBookList);
        return "index";
    }

    @RequestMapping("/403")
    public String error403(){
        return "403";
    }
}
