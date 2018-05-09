package com.company;

import java.util.Scanner;

public class DigitNotDigitDemo {
    public static void main(String[] args) {
        String value = new Scanner(System.in).nextLine();
        try {
            Integer intValue = Integer.parseInt("@");
            System.out.println("Input is a digit");
        } catch (Exception e) {

            System.out.println("Input is not a digit");
        }
    }
}
