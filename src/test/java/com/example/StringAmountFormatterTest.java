package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringAmountFormatterTest {
    
    @Test
    public void test() {
       Long result =  StringAmountFormatter.FORMATER1.format("123");
       assertEquals(Long.valueOf("123"), result);
    }
}
