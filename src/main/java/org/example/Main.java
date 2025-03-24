package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String str) {

        String newString = "";
        str = str.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

        for(int i=0;i<str.length();i++) {
            newString = str.charAt(i) + newString;
        }

        return newString.equals(str);
    }



}