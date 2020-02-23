package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/6 11:06
 */
public class Main2023 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            // 复制并获取 n个学生的平均成绩
            double[][] arr = new double[n][m];
            StringBuilder resStr = new StringBuilder();
            for (int i = 0; i < n; i++) {
                double sum = 0;
                for (int j = 0; j < m; j++) {
                    double point = scan.nextDouble();
                    arr[i][j] = point;
                    sum += point;
                }
                double avg = sum / m;
                String res = String.format("%.2f", avg);
                resStr.append(res).append(" ");
            }

            // 各课程的平均分
            double[] avgClass = new double[m];
            StringBuilder resClass = new StringBuilder();
            for (int i = 0; i < m; i++) {
                double pointSum = 0;
                for (int j = 0; j < n; j++) {
                    double point = arr[j][i];
                    pointSum += point;
                }
                double avg = pointSum / n;
                avgClass[i] = avg;
                String res = String.format("%.2f", avg);
                resClass.append(res).append(" ");
            }

            // 获取均大于平局成绩的学生数量
            int count = 0;
            for (int i = 0; i < n; i++) {
                boolean allPass = true;
                for (int j = 0; j < m; j++) {
                    double point = arr[i][j];
                    if (point < avgClass[j]) {
                        allPass = false;
                        break;
                    }
                }
                if (allPass) {
                    count++;
                }
            }
            System.out.println(resStr.substring(0, resStr.length() - 1));
            System.out.println(resClass.substring(0, resClass.length() - 1));
            System.out.println(count);
            System.out.println();
        }
    }
}
