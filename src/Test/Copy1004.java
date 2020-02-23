package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月3日 下午3:49:55
*/
public class Copy1004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();
			if (n==0) {
				break;
			}
			String arr[] = new String[n];
			int brr[] = new int[n];
			
			for (int i=0;i<n;i++) {
				arr[i] = scanner.next();
			}
		
			for (int i=0;i<n-1;i++) {
				for (int j=i+1;j<n;j++) {
					if (arr[i].equals(arr[j])) {
						brr[i]++;
					}
				}
			}
			
			int max = 0;
			int j = 0;
			for (int i=0;i<n;i++) {
				if (brr[i]>max) {
					max = brr[i];
					j = i;
				}
			}
			System.out.println(arr[j]);
		}		
	}
}
