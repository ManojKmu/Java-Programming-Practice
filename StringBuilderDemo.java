package com.example.strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Manoj"); // length=5, capacity=21
        System.out.println(s.length() + " " + s.capacity());
        System.out.println(s); // Manoj
        s.append("Kumar");
        System.out.println(s); // ManojKumar
        s.setCharAt(1, 'z');
        System.out.println(s); // MznojKumar
        String t=s.toString();
        System.out.println(t);//MznojKumar
    }
}
