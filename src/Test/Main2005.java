package Test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月17日 下午5:52:59
*/
public class Main2005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			String[] arr = str.split("\\/");
			
			int year = Integer.parseInt(arr[0]);
			int month = Integer.parseInt(arr[1]);
			int day = Integer.parseInt(arr[2]);
			
			boolean isRun = year % 4 == 0 ? true : false;
			if (year % 100 == 0 && year % 400 != 0) {
				isRun = false;
			}
			for (int i = 1; i < month; i++) {
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
					day += 31;
				} else if (i == 2) {
					int num = isRun ? 29 : 28;
					day += num;
				} else {
					day += 30;
				}
			}
			System.out.println(day);
		}
	}

}
