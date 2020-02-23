package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/10 11:43
 */
public class Main2031 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            //十进制数n
            int n = cin.nextInt();
            //R进制数r
            int r = cin.nextInt();
            StringBuilder s = new StringBuilder();
            if (n < 0) {
                n = -n;
                System.out.print("-");
            }
            int b = 'A';
            while (n > 0) {
                int t = n % r;
                if (t >= 10) {
                    int c = t - 10 + b;
                    char d = (char) c;
                    s.append(d);
                } else {
                    s.append(t);
                }
                n=n/r;
            }
            StringBuffer str=new StringBuffer(s.toString());
            new StringBuilder(str.reverse().toString());
            System.out.println(str);
        }
    }

}
