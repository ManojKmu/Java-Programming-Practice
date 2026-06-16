package com.example.training4.String;
public class PasswordValidationUsingStringsConcept {
    public static void main(String[] args) {
        String s = "Bits@8924";
        int len = s.length();
        int upperCount = 0, lowerCount = 0, digitCount = 0, specialCount = 0;

        if (len >= 8) {
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    upperCount++;
                } else if (Character.isLowerCase(c)) {
                    lowerCount++;
                } else if (Character.isDigit(c)) {
                    digitCount++;
                } else {
                    specialCount++;
                }
            }

            if (upperCount > 0 && lowerCount > 0 && digitCount > 0 && specialCount > 0) {
                System.out.println(" Password is valid");
            } else {
                System.out.println(" Password must contain uppercase, lowercase, digit, and special character");
            }
        }
        else {
            System.out.println(" Password must be at least 8 characters long");
        }
    }
}
/*
Password is valid
*/
