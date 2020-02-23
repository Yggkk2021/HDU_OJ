package Test;

import java.math.BigInteger;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月1日 下午7:02:39
*/
public class Main1002 {
	
	/**
	 * I have a very simple problem for you. 
	 * Given two integers A and B, 
	 * your job is to calculate the Sum of A + B.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			BigInteger a = scan.nextBigInteger();
			BigInteger b = scan.nextBigInteger();
			System.out.println("Case " + i + ":");
			BigInteger result = a.add(b);
			if (i == n) {
				System.out.println(a + " + " + b + " = " + result);
			} else {
				System.out.println(a + " + " + b + " = " + result);
				System.out.println();
			}
		}
	}
}
