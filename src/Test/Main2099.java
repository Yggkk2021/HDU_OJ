package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/23 21:06
 */
public class Main2099 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {

            int dividend = scan.nextInt() * 100;
            int divisor = scan.nextInt();
            if (dividend == 0 && divisor == 0) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                if ((dividend + i) % divisor == 0) {
                    if (i < 10) {
                        String num = "0" + i;
                        sb.append(num).append(" ");
                    } else {
                        sb.append(i).append(" ");
                    }
                }
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
