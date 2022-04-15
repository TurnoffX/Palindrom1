package Palindroms;

import java.util.Scanner;
public class Palindrom1 {

    static void isPallindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first text: ");
        String a = sc.nextLine();
        a = a.replaceAll("\\W", "").toLowerCase();
        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }

        if (a.equalsIgnoreCase(b)) {
            System.out.println("The text/number you provided is a palindrome!");
        } else {
            System.out.println("The text/number you provided is not a palindrome!");
        }
    }
    public static void main(String[] args) {
        isPallindrome();
    }
}