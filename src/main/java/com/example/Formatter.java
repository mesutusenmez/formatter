package com.example;
/**
 * 
 * This interface is for converting and formatting the two given types, i.e.  E to T. 
 * 
 */
public interface Formatter<T, E> {
    
    public T format(E e);

}
