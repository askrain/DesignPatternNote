package com.company.builder;

/**
 * 具体的Computer类 Macbook
 */
public class Macbook extends Computer {
    protected Macbook() {

    }

    @Override
    public void setOs() {
        os = "Mac OS X 10.10";
    }
}
