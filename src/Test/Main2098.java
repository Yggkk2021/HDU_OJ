package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/17 11:26
 */
public class Main2098 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            if (num == 0) {
                break;
            }
            int count = 0;
            if (isPrime(num - 2)) {
                count++;
            }
            for (int i = 3; i < num; i++) {
                if (isPrime(i) && isPrime(num - i)) {
                    count++;
                }
            }
            System.out.println(count / 2);
        }
    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
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
