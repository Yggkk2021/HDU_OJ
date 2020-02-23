package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月17日 下午5:46:43
*/
public class Main2004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String str = scan.next();
			if (str.length() > 3) {
				System.out.println("Score is error!");
				continue;
			}
			int score = Integer.valueOf(str);
			if (score < 0 || score > 100) {
				System.out.println("Score is error!");
				continue;
			}
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else if (score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}
		}
	}

}
