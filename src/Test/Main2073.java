package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/25 22:28
 */
public class Main2073 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            System.out.println(String.format("%.3f", Math.abs(f(x2,y2) - f(x1,y1))));
        }
    }

    private static double f(int x, int y) {
        double sum = 0.0;
        int n = x + y;
        // 无点线的长度
        for (int i = 0; i <= n; i++){
            sum += Math.sqrt(Math.pow(i, 2) + Math.pow(i - 1, 2));
        }
        // 45度线的长度
        for(int i = 1; i < n; i++){
            sum += Math.sqrt(2 * (Math.pow(i, 2)));
        }
        sum += (double) x * Math.sqrt(2.0);
        return sum;
    }
}
