package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/6 20:35
 */
public class Main2027 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < n; i++) {
                String str = scan.nextLine();
                char[] arr = str.toCharArray();
                int[] countList = new int[5];
                for (char c : arr) {
                    if (c == 'a') {
                        countList[0]++;
                    }
                    if (c == 'e') {
                        countList[1]++;
                    }
                    if (c == 'i') {
                        countList[2]++;
                    }
                    if (c == 'o') {
                        countList[3]++;
                    }
                    if (c == 'u') {
                        countList[4]++;
                    }
                }
                System.out.println("a:" + countList[0]);
                System.out.println("e:" + countList[1]);
                System.out.println("i:" + countList[2]);
                System.out.println("o:" + countList[3]);
                System.out.println("u:" + countList[4]);
                if (i < n - 1) {
                    System.out.println();
                }
            }
        }
    }
}
