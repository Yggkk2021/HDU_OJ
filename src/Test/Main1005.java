package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月12日 下午10:23:38
*/
public class Main1005 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String str = scan.nextLine();
			String[] arr = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int n = Integer.parseInt(arr[2]);
			if (a == 0 && b == 0 && n == 0) {
				System.exit(0);
			}
			int res = f(a, b, n);
			System.out.println(res);
		}
	}
	
	private static int f(int a, int b, int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		int arr[] = new int[50];  
        for (int i = 1; i < 50; i++) {  
            if (i == 1 || i == 2) {  
                arr[i] = 1;  
            } else {  
                arr[i] = (a * arr[i - 1] + b * arr[i - 2]) % 7;  
            }  
        }  
        return arr[n % 49];
	}
}
