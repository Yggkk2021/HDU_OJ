package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/9 19:26
 */
public class Main2091 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = 0;
        while (scan.hasNext()) {
            String word = scan.next();
            if (word.equals("@")) {
                break;
            }
            if (time != 0) {
                System.out.println();
            }
            time++;
            int n = scan.nextInt();
            int len = 2 * n - 1;
            int mid = len / 2;
            int[][] arr = new int[n][len];
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < len; j++) {
                    if (i == n - 1) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][mid - i] = 1;
                        arr[i][mid + i] = 1;
                    }
                }
            }

            for (int i = 0; i < n ; i++) {
                StringBuilder sb = new StringBuilder();
                int count = 0;
                for (int j = 0; j < len; j++) {
                    int num = arr[i][j];
                    if (num == 1) {
                        sb.append(word);
                        count++;
                        if (i != n - 1) {
                            if (count == 2 || i == 0) {
                                break;
                            }
                        }
                    } else {
                        sb.append(" ");
                    }
                }
                System.out.println(sb.toString());
            }

        }
    }
}
