package com.example.strings;

public class ReverseStringBuilderEx {

    public static void main(String[] args) {
        String s = "Manoj";
        StringBuilder sb = new StringBuilder(s);
        sb.append(" Kumar");
        System.out.println(sb); // Manoj Kumar

        sb.reverse();
        System.out.println(sb); // ramuK jonaM

        // Another way to reverse a string
        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i)); // ramuK jonaM
        }
        System.out.println();

        StringBuilder s2 = new StringBuilder("Fruit");
        s2.deleteCharAt(1);
        System.out.println(s2); // Fuit

        s2.insert(1, 'r');
        System.out.println(s2); // Fruit

        s2.delete(1, 3);
        System.out.println(s2); // Fit
    }
}
