package com.company;

public class StackOverFlowDemo {
    private static Integer method() {
        return method();
    }

    public static void main(String[] args) {
        method();

    }
}
