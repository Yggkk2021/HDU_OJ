package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/5 18:54
 */
public class Main2022 {

    private static int abss(int a) {
        return a > 0 ? a : (-a);
    }

    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n, m;
        int max, ans;
        int x = 0, y = 0, z = 0;
        while (cin.hasNext()) {
            n = cin.nextInt();
            m = cin.nextInt();
            max = -1;
            ans = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    z = cin.nextInt();
                    if (max < abss(z)) {
                        max = abss(z);
                        ans = z;
                        x = i;
                        y = j;
                    }
                }
            }
            System.out.println(x + " " + y + " " + ans);
        }
    }
}
