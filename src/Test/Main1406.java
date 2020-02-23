package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/21 20:01
 */
public class Main1406 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();

            for (int i = 0; i < n; i++) {
                int start = scan.nextInt();
                int end = scan.nextInt();
                if (start > end) {
                    int temp = start;
                    start = end;
                    end = temp;
                }
                int count = 0;
                for (int j = start; j <= end; j++) {
                    if (isWanShu(j)) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }

    private static boolean isWanShu(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
