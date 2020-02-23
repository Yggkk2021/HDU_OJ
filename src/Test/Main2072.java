package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/7 21:19
 */
public class Main2072 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String str = scan.nextLine();
            if (str.equals("#")) {
                break;
            }
            String[] arr = str.split(" ");
            List<String> list = new ArrayList<>();
            for (String s : arr) {
                if (!list.contains(s)) {
                    list.add(s);
                }
            }
            if (list.contains("")) {
                System.out.println(list.size() - 1);
            } else {
                System.out.println(list.size());
            }
        }
    }
}
