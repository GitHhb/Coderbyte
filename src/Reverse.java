import java.util.*;
import java.io.*;

public class Reverse {
    static String ReverseWithString(String str) {
        // Reverse using a String --> creates lots of strings
        // # of strings created == str.length()+2
        String s = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            s += str.charAt(i);
        }
        return s;
    }

    static String ReverseWithChar (String str) {
        // Reverse using a char array --> only 1 char array is required
        char[] s = new char[str.length()];
        for (int i = str.length() - 1; i >= 0 ; i--) {
            s[str.length() - 1 - i] = str.charAt(i);
        }
        return new String(s);
    }

    static String ReverseRecur(String str){
        // Reverse using recursion
        return str.equals("") ? "" : ReverseRecur(str.substring(1)) + str.charAt(0);
    }

    static String ReverseOOP(String str){
        // Reverse using existing classes
        //return new String(new StringBuilder(str).reverse());
        return new StringBuilder(str).reverse().toString(); // preferred, toString() is faster then new String()
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Reverse using String type:");
        System.out.println(ReverseWithString(input));
        System.out.println("Reverse using a char array:");
        System.out.println(ReverseWithChar(input));
        System.out.println("Reverse using recurrence:");
        System.out.println(ReverseRecur(input));
        System.out.println("Reverse using StringBuilder class:");
        System.out.println(ReverseOOP(input));
    }
}
