package Test;

import java.math.BigInteger;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年1月14日 下午11:46:48
*/
public class Copy1013 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
       BigInteger b;  
         
       while (scanner.hasNext()) {  
            b = scanner.nextBigInteger();  
            if (b.intValue()==0) {  
                break;  
            } else if (b.mod(new BigInteger(String.valueOf(9))).intValue()==0){  
                System.out.println(9);  
            } else {  
                System.out.println(b.mod(new BigInteger(String.valueOf(9))));  
            }  
        }  
	}
}
