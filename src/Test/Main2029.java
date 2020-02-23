package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/6 21:16
 */
public class Main2029 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                String str = scan.next();
                if (isHuiWen(str)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }

    private static boolean isHuiWen(String str) {
        int len = str.length();
        char[] arr = str.toCharArray();
        for (int i = 0; i < len / 2; i++) {
            if (arr[i] != arr[len - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
