package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月21日 上午11:32:18
*/
public class Main2039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				double a = scan.nextDouble();
				double b = scan.nextDouble();
				double c = scan.nextDouble();
				if (a + b > c && a + c > b && b + c > a) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}

}
