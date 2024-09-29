package com.java.trangile.program;

import java.util.Arrays;

public class Anagram {

    static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    /* Driver Code*/
    public static void main(String args[])
    {
        char str1[] = { 'g', 'r', 'a', 'm' };
        char str2[] = { 'a', 'r', 'm' };

        String s1="listen";
        String s2="silent";

        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();

        // Function Call
        if (areAnagram(c1, c2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }
}

