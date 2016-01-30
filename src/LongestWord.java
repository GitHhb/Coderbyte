import java.util.*;
        import java.io.*;

public class LongestWord {
    static String LongestWord(String sen) {
        String s[]; // one word from sen per position
        s = sen.split(" "); // put every word in an array position of its own
        int iLon = 0, iLenLon = 0;
        for (int i = 0; i < s.length; i++) if (s[i].length() > iLenLon) {iLenLon = s[i].length(); iLon = i;}
        return s[iLon];
    }
    static String LongestWord1(String sen) {
        int lon = 0; // lenght of longest word seen up to now
        String str = ""; // longest word seen up to now
        for (String s: sen.split(" ")){
            if (s.length() > lon) {
                // we found the longest word up to now, remember this one
                lon = s.length();
                str = s;
            }
        }
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        //LongestWord c = new LongestWord();
        //System.out.print(c.LongestWord(s.nextLine()));
        System.out.print(LongestWord1("Hallo hoe rsggaat het met jullie?"));
    }
}
