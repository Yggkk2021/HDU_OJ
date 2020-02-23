package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/17 11:17
 */
public class Main2161 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 1;
        while (scan.hasNext()) {
            int num = scan.nextInt();

            if (num <= 0) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(count++);
            if (isPrime(num)) {
                sb.append(": yes");
            } else {
                sb.append(": no");
            }
            System.out.println(sb.toString());
        }
    }

    private static boolean isPrime(int num) {

        if (num == 1 || num % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
