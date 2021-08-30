package com.example.spring5jokesapp2.controller;

import com.example.spring5jokesapp2.service.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {

    private final QuoteService quoteService;


    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String getQuote(Model model) {
        String quote = quoteService.obtainQuote();
        model.addAttribute("joke", quote);
        return "index";
    }
}
