package com.lib.word.controller;

import com.lib.word.service.WordCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WordCounterController {

    @Autowired
    private WordCounterService wordCounterService;

    @GetMapping("/wordcounter/{word}")
    public Integer getWordCounter(@PathVariable String word) {
        return wordCounterService.getWordCount(word);
    }

}
