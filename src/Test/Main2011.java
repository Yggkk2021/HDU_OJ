package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月21日 上午11:18:40
*/
public class Main2011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				int num = scan.nextInt();
				double res = getSum(num);
				System.out.println(String.format("%.2f", res));
			}
		}
	}

	private static double getSum(int n) {
		double sum = 0.00d;
		for (double i = 1; i <= n; i++) {
			double add = 1 / i;
			if (i % 2 == 0) {
				sum -= add;
			} else {
				sum += add;
			}
		}
		return sum;
	}
}
