import java.util.*;
import java.io.*;
import java.util.stream.Collector;

public class LetterChanges {
    String LetterChanges(String str) {
        //char[] res = char[str.length()];
        String res = "";
        for (char c: str.toCharArray()) {
            char d;
            switch (c) {
                case 'z': d = 'a'; break;
                case 'Z': d = 'A'; break;
                default:  d = (char) (c + 1);
            }
            switch (d) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': d = Character.toUpperCase(d);
            }
            res += d;
        }
        System.out.println("Print " + res);
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        LetterChanges c = new LetterChanges();
        System.out.print(c.LetterChanges(s.nextLine()));
    }

}
