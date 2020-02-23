package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/1/30 17:46
 */
public class Main2015 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {

            // 总共有多少个数字
            int n = scan.nextInt();
            // 每几个数算平均值
            int m = scan.nextInt();

            int[] arr = new int[n];
            int num = 2;
            for (int i = 0; i < n; i++, num = num + 2) {
                arr[i] = num;
            }

            int count = 0;
            int sum = 0;
            List<Integer> avgArr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                count++;
                sum += arr[i];
                if (count == m) {
                    int avg = sum / m;
                    count = 0;
                    avgArr.add(avg);
                    sum = 0;
                }
            }
            if (count != 0) {
                int avg = sum / count;
                avgArr.add(avg);
            }
            StringBuilder sb = new StringBuilder();
            for (Integer anAvgArr : avgArr) {
                sb.append(anAvgArr).append(" ");
            }
            String res = sb.substring(0, sb.length() - 1);
            System.out.println(res);
        }
    }

}
