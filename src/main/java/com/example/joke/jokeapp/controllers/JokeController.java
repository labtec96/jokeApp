package com.example.joke.jokeapp.controllers;

import com.example.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ch on 2020-02-12
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
