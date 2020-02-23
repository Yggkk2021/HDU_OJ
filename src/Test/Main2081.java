package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/7 21:29
 */
public class Main2081 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();

            for (int i = 0; i < n; i++) {
                String str = scan.next();
                char[] arr = str.toCharArray();
                StringBuilder sb = new StringBuilder();
                sb.append(6);
                for (int j = 6; j < 11; j++) {
                    sb.append(arr[j]);
                }
                System.out.println(sb.toString());
            }
        }
    }
}
