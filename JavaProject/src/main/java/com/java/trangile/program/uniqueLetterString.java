package com.java.trangile.program;

import java.util.HashSet;

public class uniqueLetterString {

    // Function to return the count of distinct
    // characters in all the distinct
    // sub-strings of the given string
    public static int countTotalDistinctTest(String str)
    {
        int cnt = 0;

        // To store all the sub-strings
        HashSet<String> items = new HashSet<>();

        for (int i = 0; i < str.length(); ++i)
        {

            // To store the current sub-string
            String temp = "";

            // To store the characters of the
            // current sub-string
            HashSet<Character> ans = new HashSet<>();
            for (int j = i; j < str.length(); ++j)
            {
                temp = temp + str.charAt(j);
                ans.add(str.charAt(j));

                // If current sub-string hasn't
                // been stored before
                if (!items.contains(temp))
                {

                    // Insert it into the set
                    items.add(temp);

                    // Update the count of
                    // distinct characters
                    cnt += ans.size();
                }
            }
        }

        return cnt;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "ABCA";
        System.out.println(countTotalDistinctTest(str));
    }
}
