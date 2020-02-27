package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/27 20:34
 */
public class Main2042 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();

            for (int i = 0; i < n; i++) {
                int count = scan.nextInt();
                int sum = countSheep(count, 3);
                System.out.println(sum);
            }
        }
    }

    private static int countSheep(int count, int start) {
        for (int i = 0; i < count; i++) {
            start = (start - 1) * 2;
        }
        return start;
    }
}
