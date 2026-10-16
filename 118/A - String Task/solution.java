import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = "aeiouy";
        String word = sc.next().toLowerCase();
        String result = "";
 
        for (int i = 0; i < word.length(); i++) {
            if (s.indexOf(word.charAt(i)) == -1) {
                result = result + "." + word.charAt(i);
            }
        }
 
        System.out.println(result);
    }
}