package Palindroms;

import java.util.Scanner;

public class Palindrom1 {

    public static void main(String[] args) {

        // String palindromes

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first text: ");
        String a = sc.next();
        String b = "";


            for (int i = a.length() - 1; i >= 0; i--) {
                    b += a.charAt(i);
            }

            if (a.contains("[a-zA-Z]")) {
                a = a.replaceAll("[^a-zA-Z ]", "");
            } else {}

                if (a.equals(b)) {
                    System.out.println("The text you provided is a palindrome!");
                } else {
                    System.out.println("The text you provided is not a palindrome!");
                }

/*
        String a = "O, ty z Katowic, Iwo? Tak, Zyto.";
        String b = "O, ty z Katowic, Iwo? Nie, Zyto.";
        int c = 12321;
        int d = 12343;
        a = a.replaceAll("[^a-zA-Z ]","");
        b = b.replaceAll("[^a-zA-Z ]","");
        String reverse = "";

            for (int i = a.length() - 1; i >= 0; i--)
            {
                reverse += a.charAt(i);
            }
            return a;

            for (int i = b.length() - 1; i >= 0; i--)
            {
                reverse += b.charAt(i);
            }
            return b;

        if (a.equalsIgnoreCase(a)) {
            System.out.println(a + " is a palindrome!");
        } else {
            System.out.println(a + " is not a palindrome!");
        }

        if (b.equalsIgnoreCase(reverse)) {
            System.out.println(b + " is a palindrome!");
        } else {
            System.out.println(b + " is not a palindrome!");
        }

        // Integer palindromes

        Integer c = 12321;
        Integer d = 12343;
        c.toString();
        d.toString();
        String reverse = "";

            for (int i = c.(length) - 1; i >= 0; i--)
            {
                reverse += c.charAt(i);
            }
            return c;

            for (int i = d.toString().length() -1; i>=0; i--)
            {
                reverse += d.toString().charAt(i);
            }
            return d;

        if (c.toString().equals(reverse)) {
            System.out.println(c + " is a palindrome!");
        } else {
            System.out.println(c + " is not a palindrome!");
        }

        if (d.toString().equals(reverse)) {
            System.out.println(d + " is a palindrome!");
        } else {
            System.out.println(d + " is not a palindrome!");
        }
        */
    }
}
