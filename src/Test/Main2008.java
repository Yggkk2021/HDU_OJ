package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月17日 下午6:43:50
*/
public class Main2008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int countPos = 0;
			int countNag = 0;
			int countZero = 0;
			
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			
			for (int i = 0; i < n; i++) {
				double num = scan.nextDouble();
				if (num < 0) {
					countNag++;
				} else if (num > 0) {
					countPos++;
				} else {
					countZero++;
				}
			}
			System.out.println(countNag + " " + countZero + " " + countPos);
		}
	}

}
