package Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月21日 上午11:01:11
*/
public class Main2010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int start = scan.nextInt();
			int end = scan.nextInt();
			
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = start; i <= end; i++) {
				if (isShuiXianHua(i)) {
					list.add(i);
				}
			}
			if (list.isEmpty()) {
				System.out.println("no");
			} else {
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < list.size(); i++) {
					sb.append(list.get(i)).append(" ");
				}
				String res = sb.substring(0, sb.length() - 1);
				System.out.println(res);
			}
		}
	}
	
	private static boolean isShuiXianHua(int num) {
		String str = String.valueOf(num);
		char[] arr = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i] - '0';
			sum += Math.pow(a, 3);
		}
		if (sum == num) {
			return true;
		}
		return false;
	}
}
