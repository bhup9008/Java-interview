package com.java.trangile.program;

public class Permutations {
    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {

            //System.out.print(ans + " ");
            System.out.print(ans+" ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

           // System.out.println(i);
            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

           // System.out.println(ros);
            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "abc";
        System.out.println("asdsdsdsa");
        printPermutn(s, "");
        System.out.println("kkkkkkkkkkkkkkkk");
    }
}
