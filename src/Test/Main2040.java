package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/17 11:05
 */
public class Main2040 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int left = scan.nextInt();
                int right = scan.nextInt();

                int qinHe = getYueSum(left);
                if (qinHe == right) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static int getYueSum (int left) {
        int sum = 1;
        int sqrt = (int) Math.sqrt(left);
        for (int i = 2; i <= sqrt; i++) {
            if (left % i == 0) {
                int last = left / i;
                sum += i + last;
            }
        }
        return sum;
    }
}
