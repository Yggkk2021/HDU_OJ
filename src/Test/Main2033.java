package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/13 17:08
 */
public class Main2033 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h;
        int m;
        int s;
        int q, w, e, r;
        while (scan.hasNext()) {
            int n = scan.nextInt();
            while (n-- > 0) {
                int ah, am, as, bh, bm, bs;
                ah = scan.nextInt();
                am = scan.nextInt();
                as = scan.nextInt();
                bh = scan.nextInt();
                bm = scan.nextInt();
                bs = scan.nextInt();

                q = as + bs;
                w = q / 60;
                s = q % 60;

                e = am + bm + w;
                r = e / 60;
                m = e % 60;

                h = ah + bh + r;
                System.out.println(h + " " + m + " " + s);
            }
        }
    }
}
