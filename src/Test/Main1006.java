package Test;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月13日 下午9:38:56
*/
public class Main1006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int num = scan.nextInt();
			if (num == -1) {
				break;
			} else if (num >= 120) {
				System.out.println("100.000");
				continue;
			}
			
			double sp_second = 6;
			double sp_min = 0.100;
			double sp_hour = 0.008;
			
			
			
			double countHappy = 0.000;
			double countNotHappy = 0.000;
			for (int i = 0; i < 60 * 60; i++) {
				double second = (sp_second * i) % 360;
				double minuet = sp_min * i;
				double hour = sp_hour * i;
				
				double[] arr = new double[3];
				arr[0] = second;
				arr[1] = minuet;
				arr[2] = hour;
				Arrays.sort(arr);
				
				double max = arr[2];
				double mid = arr[1];
				double min = arr[0];
				
				double diff1 = Math.min(max - mid, 359 - (max - mid));
				double diff2 = Math.min(max - min, 359 - (max - min));
				double diff3 = Math.min(mid - min, 359 - (mid - min));
				
				if (diff1 >= num && diff2 >= num && diff3 >= num) {
					countHappy += 1;
				} else {
					countNotHappy += 1;
				}
			}
			double res = 0.000;
			res = countHappy / countNotHappy;
			System.out.println(String.format("%.3f", res));
		}
	}

}
