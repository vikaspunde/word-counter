package com.lib.word.service;

import com.lib.word.exceptions.InvalidException;
import com.lib.word.exceptions.NotFoundException;
import com.lib.word.util.Translator;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class WordCounterService {

    private Map<String, Integer> linkedHashMap;
    private Map<String, Integer> linkedHashMapCount;

    public WordCounterService() {
        linkedHashMap = new LinkedHashMap<>();
        linkedHashMapCount = new LinkedHashMap<>();
    }

    public Integer getWordCount(String word) {
        //translate input to english word
        if (!(word != null && word.chars().allMatch(Character::isLetter)))
            throw new InvalidException(word);

        String englishWord = Optional.ofNullable(Translator.translate(word)).orElseThrow(() -> new NotFoundException(word));
        this.addWord(englishWord);
        return Optional.ofNullable(linkedHashMap.get(englishWord)).orElse(0);
    }

    private void addWord(String englishWord) {
        if (linkedHashMap.keySet().contains(englishWord)) {
            linkedHashMap.put(englishWord, linkedHashMap.get(englishWord) + 1);
        } else {
            linkedHashMap.put(englishWord, 1);

        }
    }
}
