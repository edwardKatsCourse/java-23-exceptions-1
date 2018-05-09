package com.company;

public class ExceptionArchitecture {
    public static void main(String[] args) {
        try {
            run();
        } catch (GeneralAPIException e) {
            System.out.println("Something planned went wrong");

        } catch (Exception e) {
            System.out.println("Something out of the order");
            //trying to fix on error

        } finally {
            try {

            } catch (Exception e) {

            }
        }
    }

    public static void run() {
        //menu
        //sub menu

        throw new GeneralAPIException();
    }
}

class GeneralAPIException extends RuntimeException {

}
