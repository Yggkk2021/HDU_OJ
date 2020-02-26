package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/26 20:35
 */
public class Main2041 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int level = scan.nextInt();
                int time = f(level - 1);
                System.out.println(time);
            }
        }
    }

    private static int f(int level) {
        if (level <= 0) {
            return 0;
        }
        if (level == 1) {
            return 1;
        }
        if (level == 2) {
            return 2;
        }
        return f(level - 1) + f(level - 2);
    }
}
