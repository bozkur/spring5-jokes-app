package com.example.spring5jokesapp2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Override
    public String obtainQuote() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
