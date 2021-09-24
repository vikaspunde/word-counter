package com.lib.word.util;

import java.util.HashMap;
import java.util.Map;

public class Translator {
 private static Map<String, String> map = new HashMap<>();
    static {
        map.put("blume", "flower");    // spanish
        map.put("flor", "flower");     // german
        map.put("flower", "flower");   // english

        map.put("shown", "dog");        // spanish
        map.put("tiga", "dog");      // german
        map.put("dog", "dog");          // english

        map.put("apos", "apple");       // spanish
        map.put("akir", "apple");      // german
        map.put("apple", "apple");      // english
    }

    public static String translate(String word){
        return map.get(word);
    }

}
