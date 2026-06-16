package com.example.recurssion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsets2 {

    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subsets(s, 0, "", list);
        System.out.println(list);
    }

    private static void subsets(String s, int idx, String ans, List<String> list) {
        if (idx == s.length()) {
            list.add(ans);
            return;
        }

        char ch = s.charAt(idx);

        // Choice 1: include current character
        subsets(s, idx + 1, ans + ch, list);

        // Choice 2: exclude current character
        subsets(s, idx + 1, ans, list);
    }
}
// [abc, ab, ac, a, bc, b, c, ]