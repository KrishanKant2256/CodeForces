import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s=sc.next();
        String t=sc.next();
        if (s.length() == t.length()) {
            boolean flag = true;
            int i = 0;
 
            while (i < s.length()) {
                if (s.charAt(i) != t.charAt(t.length() - 1 - i)) {
                    flag = false;
                    break;
                    }
                        i++;
                    }
            
                    if (flag) {
                        System.out.println("YES");
                    } else {
                           System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
//none
}
}