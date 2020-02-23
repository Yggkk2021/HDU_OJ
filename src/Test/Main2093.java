package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/8 21:00
 */
public class Main2093 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Acmer> acmers = new ArrayList<Acmer>();
        int testNums, punishT;
        testNums = in.nextInt();
        punishT = in.nextInt();
        String name;
        int acnums, details;
        while (in.hasNext()) {
            name = in.next();
            acnums = 0;
            details = 0;
            for (int i = 0; i < testNums; i++) {
                String t = in.next();
                if (t.charAt(0) != '0' && t.charAt(0) != '-') {
                    acnums++;
                    if (t.contains("(")) {
                        String split[] = t.split("\\(|\\)");
                        details += Integer.valueOf(split[0]) + punishT * Integer.valueOf(split[1]);
                    } else {
                        details += Integer.valueOf(t);
                    }
                }
            }
            Acmer acmer = new Acmer(name, acnums, details);
            acmers.add(acmer);
        }
        sort(acmers);
        output(acmers);
        in.close();
    }

    private static void output(ArrayList<Acmer> acmers) {
        for (Acmer acmer : acmers) {
            acmer.show();
        }
    }

    private static void sort(ArrayList<Acmer> acmers) {
        boolean flag = false;
        int size = acmers.size();
        Acmer acmer1, acmer2;
        // acNums
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                acmer1 = acmers.get(j);
                acmer2 = acmers.get(j + 1);
                if (acmer1.getAcNums() < acmer2.getAcNums()) {
                    Collections.swap(acmers, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            flag = false;
        }
        // wT
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                acmer1 = acmers.get(j);
                acmer2 = acmers.get(j + 1);
                if (acmer1.getAcNums() == acmer2.getAcNums() && acmer1.getwT() > acmer2.getwT()) {
                    Collections.swap(acmers, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            flag = false;
        }
        // name
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                acmer1 = acmers.get(j);
                acmer2 = acmers.get(j + 1);
                if (acmer1.getAcNums() == acmer2.getAcNums() && acmer1.getwT() == acmer2.getwT()
                        && acmer1.getName().compareTo(acmer2.getName()) > 0) {
                    Collections.swap(acmers, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
            flag = false;
        }
    }
}

class Acmer {
    private String name;
    private int acNums;
    private int wT;

    public Acmer(String name, int acNums, int wT) {
        super();
        this.name = name;
        this.acNums = acNums;
        this.wT = wT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcNums() {
        return acNums;
    }

    public void setAcNums(int acNums) {
        this.acNums = acNums;
    }

    public int getwT() {
        return wT;
    }

    public void setwT(int wT) {
        this.wT = wT;
    }

    public void show() {
        System.out.printf("%-10s%3d%5d%n", name, acNums, wT);
    }
}