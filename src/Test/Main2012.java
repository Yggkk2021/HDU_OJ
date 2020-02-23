package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月23日 上午11:40:27
*/
public class Main2012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String str = scan.nextLine();
			String[] arr = str.split(" ");
			int start = Integer.parseInt(arr[0]);
			int end = Integer.parseInt(arr[1]);
			
			if (start == 0 && end == 0) {
				break;
			}
			
			String res = "OK";
			for (int i = start; i <= end; i++) {
				int num = i * i + i + 41;
				if (!isSuShu(num)) {
					res = "Sorry";
					break;
				}
			}
			System.out.println(res);
		}
	}

	private static boolean isSuShu(int n) {
		if (n == 1 || n % 2 ==0 && n !=2) {
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
