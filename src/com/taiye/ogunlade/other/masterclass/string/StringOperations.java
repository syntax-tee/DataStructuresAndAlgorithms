package com.taiye.ogunlade.other.masterclass.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOperations {

    public static void main(String[] args) {
        String testString = "Taiye Emmanuel";
        System.out.println("Reversed String ::: " + reverseString(testString));

        List<String> prefixes = getPrefixes("Hello");
        List<String> suffixes = getSuffixes("Hello");


        System.out.println("Prefixes");
        for (String s : prefixes) {
            System.out.println("" + s);
        }


        System.out.println("Suffixes");
        for (String s : suffixes) {
            System.out.println("" + s);
        }


        //0(N)
        //Longest Common Prefix
        System.out.println("Longest common " + longestCommonPrefix("Hello", "HelloOk"));

        System.out.println("Longest Repeated Substring "+ longestRepeatedSubstring("taiyelolutaiyeloluwa"));

    }

    public static String reverseString(String text) {
        int lengthOfText = text.length(); //O(1)
        StringBuilder reversedString = new StringBuilder();
        for (int index = lengthOfText - 1; index >= 0; index--) { // O(N)
            reversedString.append(text.charAt(index));  //O(N) + 0(1) = 0(N)
        }
        return reversedString.toString();
    }


    public static List<String> getSuffixes(String text) {
        int lengthOfText = text.length();
        List<String> suffixesList = new ArrayList<>();
        for (int i = 0; i < lengthOfText; ++i) {
            suffixesList.add(text.substring(i, lengthOfText));
        }
        return suffixesList;
    }

    public static List<String> getPrefixes(String text) {
        int lengthOfText = text.length();
        List<String> prefixesList = new ArrayList<>();
        for (int index = 1; index < lengthOfText + 1; ++index) {
            prefixesList.add(text.substring(0, index));
        }
        return prefixesList;
    }


    public static String longestCommonPrefix(String text1, String text2) {
        int commonLength = Math.min(text1.length(), text2.length());
        for (int index = 0; index < commonLength; ++index) {
            if (text1.charAt(index) != text2.charAt(index)) {
                return text1.substring(0, index);
            }
        }
        return text1.substring(0, commonLength);
    }

    public static String longestRepeatedSubstring(String text) {
        int lengthOfText = text.length();
        List<String> suffixes = getSuffixes(text);
        Collections.sort(suffixes);
        String longestSubstring = "";

        for (int i = 0; i < lengthOfText - 1; i++) {
            String tempString = longestCommonPrefix(suffixes.get(i), suffixes.get(i + 1));
            if (tempString.length() > longestSubstring.length()) {
                longestSubstring = tempString;
            }
        }
        return longestSubstring;
    }
}
