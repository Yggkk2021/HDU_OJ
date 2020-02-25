package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/25 21:29
 * 判定IP地址是否正确
 */
public class Main2206 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String s = scan.nextLine();

            if (countPoint(s) != 3 || s.contains(" ")) {
                System.out.println("NO");
                continue;
            }
            boolean isRight = true;
            String[] arr = s.split("\\.");
            if (arr.length != 4) {
                System.out.println("No");
                continue;
            }
            try {
                for (String anArr : arr) {
                    if (isFirstZero(anArr)) {
                        isRight = false;
                        break;
                    } else {
                        int num = Integer.parseInt(anArr);
                        if (num < 0 || num > 255) {
                            isRight = false;
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                isRight = false;
            }
            if (isRight) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static int countPoint(String str) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (char anArr : arr) {
            if (anArr == '.') {
                count++;
            }
        }
        return count;
    }

    private static boolean isFirstZero(String num) {
        char[] arr = num.toCharArray();
        return arr[0] == '0';
    }
}
