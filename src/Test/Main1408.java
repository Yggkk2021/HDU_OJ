package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/18 12:31
 */
public class Main1408 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            double vul = scan.nextDouble();
            double drop = scan.nextDouble();

            int time = 0;
            int i = 1;
            boolean flog = false;
            while (vul > 0) {
                for (int j = 0; j < i; j++) {
                    vul -= drop;
                    time++;
                    if (vul <= 0) {
                        flog = true;
                        break;
                    }
                }
                if (flog) {
                    break;
                }
                time++;
                i++;
            }
            System.out.println(time);
        }
    }
}
