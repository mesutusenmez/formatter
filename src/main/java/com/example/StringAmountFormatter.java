package com.example;

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
