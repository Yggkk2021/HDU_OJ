package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/5 18:44
 */
public class Main2021 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                int count = getCount(num);
                sum += count;
            }

            System.out.println(sum);
        }
    }

    private static int getCount(int num) {
        int res = 0;
        if (num >= 100) {
            res = num / 100;
            num = num % 100;
        }
        int count;
        if (num >= 50) {
            count = num / 50;
            res += count;
            num = num % 50;
        }
        if (num >= 10) {
            count = num / 10;
            res += count;
            num = num % 10;
        }
        if (num >= 5) {
            count = num / 5;
            res += count;
            num = num % 5;
        }
        if (num >= 2) {
            count = num / 2;
            res += count;
            num = num % 2;
        }
        res += num;
        return res;
    }
}
