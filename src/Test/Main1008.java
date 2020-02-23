package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月14日 下午10:57:45
*/
public class Main1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			int last = 0;
			int time = 0;
			for (int i = 0; i < n; i++) {
				int level = scan.nextInt();
				int diff = level - last;
				if (diff > 0) {
					time += diff * 6;
				} else {
					diff = -diff;
					time += diff * 4;
				}
				last = level;
			}
			time += 5 * n;
			System.out.println(time);
		}
	}

}
