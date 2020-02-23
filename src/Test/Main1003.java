package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月1日 下午8:08:08
*/
public class Main1003 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		scan.nextLine();
		
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			String[] arr = str.split(" ");
			if (i != 0) {
				System.out.println();
			}
			System.out.println("Case " + (i + 1) + ":");
			function(arr);
		}
		scan.close();
	}
	
	public static void function(String[] arr) {
		int[] a = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			a[i] = Integer.parseInt(arr[i]);
		}
		int start = 1;
		int max = Integer.MIN_VALUE;
		
		int startRes = 0;
		int endRes = 0;
		
		while (start <= a.length) {
			int sum = 0;
			for (int i = start; i < a.length; i++) {
				if (start == i) {
					sum = a[start];
				} else {
					sum += a[i];
				}
				if (sum > max) {
					max = sum;
					startRes = start;
					endRes = i;
				}
			}
			start++;
		}
		System.out.println(max + " " + startRes + " " + endRes);
	}
}
