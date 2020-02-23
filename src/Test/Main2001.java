package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月16日 下午10:15:03
*/
public class Main2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String loc = scan.nextLine();
			String[] arr = loc.split(" ");
			
			double x1 = Double.parseDouble(arr[0]);
			double y1 = Double.parseDouble(arr[1]);
			double x2 = Double.parseDouble(arr[2]);
			double y2 = Double.parseDouble(arr[3]);
			
			double res = 0.00;
			res = Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow(x2 - x1, 2));
			res = Math.abs(res);
			System.out.println(String.format("%.2f", res));
		}
	}

}
