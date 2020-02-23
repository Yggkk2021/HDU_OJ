package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月30日 下午5:31:32
*/
public class Main2013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			int sum = 1;
			for (int i = 1; i < n; i++) {
				sum = (sum + 1) * 2;
			}
			System.out.println(sum);
		}
	}

}
