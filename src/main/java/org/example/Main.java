package org.example;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        checkForPalindrome("Was it a car or a cat I saw ?");
    }

    public static boolean checkForPalindrome(String str) {

        String newString = "";
        //Locale.ROOT ifadesini dil bağımsız dönüşüm yapmak için kullandık, yoksa test geçmiyor
        str = str.toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z\\s]", "");
        str = str.replaceAll(" ", "");
        for(int i=0;i<str.length();i++) {
            newString = str.charAt(i) + newString;

        }
        return newString.equals(str);
    }

    public static String convertDecimalToBinary(int number) {
        String binary = "";
        while(number>0) {
            int i = number % 2;
            binary = String.valueOf(i) + binary;
            number = number/2;
        }

        return binary;
    }

}