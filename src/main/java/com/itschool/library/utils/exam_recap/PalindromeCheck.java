package com.itschool.library.utils.exam_recap;

public class PalindromeCheck {

    public static void main(String[] args) {
        String input = "Hello";
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("The input is a palindrome");
        } else {
            System.out.println("The input is not a palindrome");
        }
    }
}

