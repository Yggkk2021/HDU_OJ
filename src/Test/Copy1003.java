package Test;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月1日 下午9:21:55
*/
public class Copy1003 {
	
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int k = t;
		//用于控制格式
		boolean flag = true;
		while (k-- > 0) {
			int m = input.nextInt();
			int max = -1002;
			int start = 0;
			int end = 0;
			int sum = 0;
			int s;
			for (int i = 0, j = 0; i < m; i++) {
				s = input.nextInt();
				sum += s;
				if (sum > max) {
					max = sum;
					start = j;
					end = i;
				}
				if (sum < 0) {
					sum = 0;
					j = i + 1;
				}
			}

			if (flag) {
				System.out.println("Case " + (t - k) + ":");
				System.out.println(max + " " + (start + 1) + " " + (end + 1));
				flag = false;
			} else {
				System.out.println();
				System.out.println("Case " + (t - k) + ":");
				System.out.println(max + " " + (start + 1) + " " + (end + 1));
			}
		}
	}
}
