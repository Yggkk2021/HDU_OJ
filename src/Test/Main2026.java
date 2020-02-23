package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/6 20:27
 */
public class Main2026 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String str = scan.nextLine();

            String[] arr = str.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String anArr : arr) {
                sb.append(getUpWord(anArr)).append(" ");
            }
            String res = sb.substring(0, sb.length() - 1);
            System.out.println(res);
        }
    }

    private static String getUpWord(String str) {
        char[] arr = str.toCharArray();
        String frsit = String.valueOf(arr[0]).toUpperCase();
        if (str.length() <= 1) {
            return frsit;
        }
        StringBuilder sb = new StringBuilder(frsit);
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
