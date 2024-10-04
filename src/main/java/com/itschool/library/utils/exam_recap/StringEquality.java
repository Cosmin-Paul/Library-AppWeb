package com.itschool.library.utils.exam_recap;

public class StringEquality {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);     //true
        System.out.println(s1 == s3);     //false
        System.out.println(s1.equals(s3));//true
    }
}