package com.neoteric.springbootdocker.interfaces;

public class interfaceplemetion implements ExceptionTest {
    @Override
    public void print() {
        throw new RuntimeException("Unchecked exception");
    }
}
