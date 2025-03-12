package com.adrar.hello.model;

public class HelloWorld {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "value='" + value + '\'' +
                '}';
    }
}
