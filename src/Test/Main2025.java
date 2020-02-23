package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/6 20:21
 */
public class Main2025 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String str = scan.next();
            char[] arr = str.toCharArray();
            char max = 'a';
            for (char c : arr) {
                if (c > max) {
                    max = c;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : arr) {
                sb.append(c);
                if (c == max) {
                    sb.append("(max)");
                }
            }
            String res = sb.toString();
            System.out.println(res);
        }
    }
}
