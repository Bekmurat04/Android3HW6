package com.example.testapplication;

import com.example.testapplication.data.StringMethods;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringMethodsTest {

    StringMethods stringMethods;

    @Before
    public void create(){
        stringMethods = new StringMethods();
    }

    @Test
    public void reverseWords(){
        assertEquals("World Hello",stringMethods.reverseWord("Hello World"));
    }

    @Test
    public void reverseCharacters(){
        assertEquals("dlroW olleH",stringMethods.reverseCharacters("Hello World"));
        assertEquals("olleH",stringMethods.reverseCharacters("Hello"));
    }

}
