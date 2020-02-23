package Test;

import java.math.BigInteger;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月14日 下午11:30:13
*/
public class Main1013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String num = scan.next();
			if (num.trim().equals("0")) {
				break;
			}
			if (num.length() == 1) {
				System.out.println(num);
			} else {
				int count = num.charAt(0) - '0';
				for (int i = 1; i < num.length(); i++) {
					count += num.charAt(i) - '0';
					if (i == num.length() - 1) {
						if (String.valueOf(count).length() == 1) {
							System.out.println(count);
						} else {
							i = 0;
							count = num.charAt(0) - '0';
							num = String.valueOf(count);
						}
					}
				}
			}
		}
	}
}
