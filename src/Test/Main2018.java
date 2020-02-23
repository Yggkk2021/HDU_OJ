package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/4 20:22
 */
public class Main2018 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();

            if (n == 0) {
                break;
            }
            int[] arr = new int[n];

            arr[0] = 1;
            for (int i = 1; i < n; i++) {
                int last = arr[i - 1];
                if (i >= 3) {
                    int num = arr[i - 3];
                    arr[i] = num + last;
                } else {
                    arr[i] = last + 1;
                }
            }
            int sum = arr[n - 1];
            System.out.println(sum);
        }
    }
}
