package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/17 11:00
 */
public class Main2090 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0.0;
        while (scan.hasNext()) {
            String food = scan.next();
            double count = scan.nextDouble();
            double price = scan.nextDouble();
            sum += count * price;
            String res = String.format("%.1f", sum);
            System.out.println(res);
        }
        String res = String.format("%.1f", sum);
        System.out.println(res);
    }
}
