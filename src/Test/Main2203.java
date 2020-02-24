package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/24 20:51
 */
public class Main2203 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();

            while (s1.length() < s2.length()) {
                s1 = s1 + s1;
            }
            s1 = s1 + s1;
            if (s1.contains(s2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
