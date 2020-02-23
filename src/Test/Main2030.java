package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/6 21:25
 */
public class Main2030 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < n; i++) {
                String str = scan.nextLine();
                int count = 0;
                byte[] bys = str.getBytes();
                for (byte by : bys) {
                    if (by < 0) {
                        count++;
                    }
                }
                System.out.println(count / 2);
            }
        }
    }
}
