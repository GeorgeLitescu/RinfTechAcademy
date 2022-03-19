package com.company;

public class Main {

    public static void main(String[] args) {
        CheckLowercase ex1 =  new CheckLowercase();
        CheckPin ex2 = new CheckPin();
        TextConversion ex34 = new TextConversion();

        System.out.println(ex1.validate("java_exercise"));
        System.out.println(ex1.validate("Java_Exercise"));
        System.out.println(ex1.validate("javaexercise"));

        System.out.println("\n" + ex2.validate("123"));
        System.out.println(ex2.validate("1234"));
        System.out.println(ex2.validate("12345"));
        System.out.println(ex2.validate("123456"));

        System.out.println("\n" + ex34.removePQR("Java Exercise"));
        System.out.println(ex34.removePQR("The quick brown fox jumps over the lazy dog"));

        System.out.println("\n" + ex34.vowelToStar("Java Exercise"));
        System.out.println(ex34.vowelToStar("Java Exercise".toUpperCase()));
        System.out.println(ex34.vowelToStar("The quick brown fox jumps over the lazy dog"));

    }
}
