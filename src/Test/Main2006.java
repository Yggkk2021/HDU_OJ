package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月17日 下午6:19:42
*/
public class Main2006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int product = 1;
			boolean hasOdd = false;
			for (int i = 0; i < n; i++) {
				int num = scan.nextInt();
				if (num % 2 != 0) {
					hasOdd = true;
					product *= num;
				}
			}
			if (hasOdd) {
				System.out.println(product);
			} else {
				System.out.println(0);
			}
		}
	}

}
