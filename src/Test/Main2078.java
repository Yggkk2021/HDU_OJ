package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/22 18:16
 */
public class Main2078 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int c = scan.nextInt();
            for (int i = 0; i < c; i++) {
                int n = scan.nextInt();
                int m = scan.nextInt();

                int min = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    int num = scan.nextInt();
                    min = min > num ? num : min;
                }
                int eff = (int) Math.pow(100 - min, 2);
                System.out.println(eff);
            }

        }
    }
}
