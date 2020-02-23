package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/2 9:57
 */
public class Main2016 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int[] arr = new int[n];

            int min = Integer.MAX_VALUE;
            int minIndex = 0;

            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                arr[i] = num;

                if (num < min) {
                    min = num;
                    minIndex = i;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[0];
            arr[0] = temp;

            StringBuilder sb = new StringBuilder();
            for (Integer i : arr) {
                sb.append(i).append(" ");
            }
            String res = sb.substring(0, sb.length() - 1);
            System.out.println(res);
        }
    }
}
