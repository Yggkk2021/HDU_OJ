package Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月3日 下午2:12:14
*/
public class Main2138 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			long n = scan.nextLong();
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (long i = 0; i < n; i++) {
				int num = scan.nextInt();
				list.add(num);
			}
			long result = 0;
			for (int i = 0; i < list.size(); i++) {
				int a = list.get(i);
				if (isPrimeNumber(a)) {
					result++;
				}
			}
			
			System.out.println(result);
		}
	}
	
	private static boolean isPrimeNumber(int n) {
		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		int sqrt = (int) Math.sqrt(n);
		for (int i = 3; i <= sqrt; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
