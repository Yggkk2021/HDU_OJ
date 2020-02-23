package Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/1/30 17:40
 */
public class Main2014 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextDouble();
            }
            Arrays.sort(arr);
            arr[0] = 0;
            arr[arr.length - 1] = 0;
            int len = arr.length;
            double sum = 0;
            for (double anArr : arr) {
                sum += anArr;
            }

            double avg = sum / (len - 2);
            System.out.println(String.format("%.2f", avg));
        }
    }
}
