package com.example;


/**
 * 
 * This class formats string values as long values. 
 * You can add new formatters such as FORMATTER1 and FORMATTER2.
 * 
 */
public enum StringAmountFormatter implements Formatter<Long, String> {
    FORMATER1 {

        @Override
        public Long format(String value) {
            return Long.valueOf(value);
        }

    },
    FORMATTER2 {

        @Override
        public Long format(String value) {
            
            return Long.valueOf(value.replace("", ","));
        }

    };

    @Override
    public abstract Long format(String value);

}
