package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月16日 下午10:28:39
*/
public class Main2002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double r = scan.nextDouble();
			double x = 4 / 3d;
			double f = 3.1415927;
			double volume = x * f * r * r * r;
			System.out.println(String.format("%.3f", volume));
		}
	}

}
