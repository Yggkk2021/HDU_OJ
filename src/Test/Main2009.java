package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月17日 下午7:00:30
*/
public class Main2009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			double num = scan.nextDouble();
			int m = scan.nextInt();
			double sum = num;
			for (int i = 0; i < m - 1; i++) {
				double sqrt = Math.sqrt(num);
				sum += sqrt;
				num = sqrt;
			}
			System.out.println(String.format("%.2f", sum));
		}
	}

}
