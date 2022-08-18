package com.kelly.springbootsecurity.controller;


import com.kelly.springbootsecurity.model.NewBook;
import com.kelly.springbootsecurity.rowmapper.NewBookRowMapper;
import com.kelly.springbootsecurity.rowmapper.UserRowMapper;
import com.kelly.springbootsecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DemoController {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;



    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }*/

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @GetMapping("/signIn")
    public String signIn(){

        return null;
    }

    /*@GetMapping("/403")
    public String error403(){
        return "403";
    }*/


    @RequestMapping("/book")
    public String NewBook(Model model){
        String sql="SELECT Title, Author, Call_Number, Barcode, Exh_fr, Exh_end, book_id,revise_date,act_yn" +
                " FROM new_book WHERE 1=1";


        Map<String,Object> map=new HashMap<>();

        List<NewBook> newBookList = namedParameterJdbcTemplate.query(sql, map, new NewBookRowMapper());
        model.addAttribute("NewBookList",newBookList);

        return "NewBook";
    }


    @RequestMapping("/table")
    public String table(Model model){
        String sql="SELECT user_id, user_name, email, password, enabled " +
                " FROM users WHERE 1=1";

        Map<String,Object> map=new HashMap<>();

        List<User> userList=namedParameterJdbcTemplate.query(sql, map, new UserRowMapper());
        model.addAttribute("tables",userList);

        return "table";
    }
}
