package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月17日 下午6:27:47
*/
public class Main2007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			if (end < start) {
				int temp = end; 
				end = start;
				start = temp;
			}
			long even = 0;
			long odd = 0;
			
			for (int i = start; i <= end; i++) {
				if (i % 2 == 0) {
					even += Math.pow(i, 2);
				} else {
					odd += Math.pow(i, 3);
				}
			}
			System.out.println(even + " " + odd);
		}
	}

}
