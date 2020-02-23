package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月16日 下午10:42:40
*/
public class Main2003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			double num = scan.nextDouble();
			double res = Math.abs(num);
			System.out.println(String.format("%.2f", res));	
		}
	}

}
