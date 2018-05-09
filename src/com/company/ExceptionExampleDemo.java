package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionExampleDemo {

    static String [] names = new String[0];

    public static void main(String[] args) /* throws RuntimeException */{
        while (true) {

            String name = new Scanner(System.in).nextLine();
            try {

                addNewName(name);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("No changes are made to the array");
            }
            System.out.println(Arrays.toString(names));
        }
    }

    public static void addNewName(String name) {

        checkIfNameExists(name);
        checkMaximumLength(name);

        checkMinimalLength(name);

        String [] copyNames = new String[names.length + 1];

        for (int i = 0; i < names.length; i++) {
            copyNames[i] = names[i];
        }

        copyNames[copyNames.length -1 ] = name;
        names = copyNames;
    }

    public static void checkIfNameExists(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                String message = String.format("Such name already exists: [%s]", name);
                throw new IllegalArgumentException(message);
            }
        }
    }

    public static void checkMaximumLength(String name) {
        if (name.length() > 10) {
            String message = String.format("Name cannot exceed 10 characters: [%s]", name);
            throw new RuntimeException(message);
        }
    }

    /**
     *
     * String s = null; -> is null
     * String s = ""; -> is empty (s.length() != 0)
     * String s = "  ".trim(); -> s.length() != 0 after .trim().
     * Trim removes all spaces and tabs in the beginning and in the end
     *
     */
    public static void checkNotNullAndNotEmptyAndNotBlank(String name) {
       if (name == null || name.trim().isEmpty()) {
           throw new NullPointerException("Name cannot be blank");
       }
    }

    public static void checkMinimalLength(String name) {
        checkNotNullAndNotEmptyAndNotBlank(name);

        if (name.length() <= 2) {
            String message = String.format("Name cannot be less than 2 characters: [%s]", name);
            throw new IllegalArgumentException(message);
        }
    }
}
