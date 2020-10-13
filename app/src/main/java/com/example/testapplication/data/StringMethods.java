package com.example.testapplication.data;

public class StringMethods {

    public String reverseWord(String word){
        String[] strings = String.valueOf(word).split("\\ ");
        String reversedWord = "";
        int k = strings.length -1;
        if (strings.length > 1){
            for (int i = 1; i < strings.length ; i++) {
                strings[i] = strings[i] + " ";
            }
        }
        for (int i = k; i >= 0 ; i--) {
            reversedWord = reversedWord + strings[i];
        }
        return reversedWord;

//        char[] chars =
    }

    public String reverseCharacters(String word){
        char[] chars = word.toCharArray();
        int key = chars.length - 1;
        String reverseWord = "";
        for (int i = key; i >= 0 ; i--) {
            reverseWord = reverseWord + chars[i];
        }
        return reverseWord;
    }

}
