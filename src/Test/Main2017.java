package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/2 10:08
 */
public class Main2017 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            scan.nextLine();

            for (int i = 0; i < n; i++) {
                int count = 0;
                String str = scan.nextLine();
                char[] arr = str.toCharArray();

                for (char anArr : arr) {
                    try {
                        String s = String.valueOf(anArr);
                        int num = Integer.parseInt(s);
                        count++;
                    } catch (Exception ignored) {
                    }
                }
                System.out.println(count);
            }
        }
    }
}
