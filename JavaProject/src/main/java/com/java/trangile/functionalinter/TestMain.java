package com.java.trangile.functionalinter;

public class TestMain {
    public static void main(String[] args) {

        I test1 = new I() {
            public String test() {
                //System.out.println("Display using Anonymous inner class");
                return "Display using Anonymous inner class";
            }
        };
        String string=test1.test();
        System.out.println(string);


        I test2 = () -> {    // lambda expression
            //System.out.println("Display using Lambda Expression");
            return "Display using Lambda Expression";
        };
        String string1=test2.test();
        System.out.println(string1);


    }
}
