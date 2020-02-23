package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月1日 下午6:45:49
*/
public class Main1001 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		while(scan.hasNextInt()){
//			int a = scan.nextInt();
//			int sum = 0;
//			for(int i = 1;i<=a;i++){
//				sum+=i;
//			}
//			System.out.println(sum);
//			System.out.println();
//			
//		}
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n < 0) {
				continue;
			}
			int result = n * (n + 1) / 2;
			System.out.println(result);
			System.out.println();
		}
	}
}
