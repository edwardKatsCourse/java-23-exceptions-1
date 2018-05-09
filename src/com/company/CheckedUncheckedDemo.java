package com.company;

public class CheckedUncheckedDemo {
    /**
     *
     * try catch finally
     * throw throws
     */

    public static void main(String[] args) {




//        try {
//            checkedExceptionExample(0);
//            //No continuation after this point
//            System.out.println("Try reached its end");
//        } catch (Exception e) {
//            System.out.println("Catch called");
//        } finally {
//            System.out.println("Finally called");
//        }

//        checkedExceptionExample(1);

//        try {
//
//            m1();
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            if (false) {

                checkedExceptionExample(0);
            } else {

                uncheckedExceptionExample();
            }
        } catch (RuntimeException e) {

            System.out.println("RuntimeException occurred");
            System.out.println(e.getMessage());
        } catch (Exception e) {

            System.out.println("Exception occurred");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }

    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        uncheckedExceptionExample();
    }

    public static void uncheckedExceptionExample(){

        //new RuntimeException();
        throw new RuntimeException("My error has occurred");
//        System.out.println("2");
    }


    public static void checkedExceptionExample(int i) throws Exception {
        //C:\Users\bla bla\file.txt

        if (i == 0) {

            //method interrupted
            throw new Exception("Checked message occurred");
        }
        //methods ended
    }





}
