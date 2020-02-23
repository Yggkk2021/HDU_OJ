package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月1日 下午9:59:21
*/
public class Main1004 {
	
	/**
	 * 找出最流行的气球颜色
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			String[] arr = new String[n];
			int[] indexs = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.next();
			}
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					if (arr[i].equals(arr[j])) {
						indexs[i] = indexs[i] + 1;
					}
				}
			}
			int index = 0;
			int max = 0;
			for (int i = 0; i < n; i++) {
				if (indexs[i] > max) {
					index = i;
					max = indexs[i];
				}
			}
			System.out.println(arr[index]);
		}
	}
}
