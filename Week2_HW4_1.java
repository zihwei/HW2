/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_hw4_1;

import java.util.*;

/**
 *
 * @author 子溦
 */
public class Week2_HW4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] radius = new double[100][2];//[][0]半長軸，[][1]半短軸
        double radius_short, radius_long;
        int count = 1;
        int num;


        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入半徑以產生不同的圓形(任意半軸輸入 0 ->結束)");
        while (true) {
            System.out.println("編號" + count + "半長軸:");
            radius_long = scanner.nextDouble();
            System.out.println("編號" + count + "半短軸:");
            radius_short = scanner.nextDouble();
            if (radius_short == 0 || radius_long == 0) {
                System.out.println("輸入完成");
                break;
            } else if (radius_short >= radius_long || radius_short < 0 || radius_long < 0) {
                System.out.println("輸入錯誤，請重新輸入");
            } else {
                radius[count][0] = radius_long;
                radius[count][1] = radius_short;
                count++;
            }
        }
        System.out.print("輸入圖形編號:");
        num = scanner.nextInt();
        if (num < count && num >= 1) {
            Oval o = new Oval(radius[num][0],radius[num][1] );
            System.out.println("半長軸:" + radius[num][0]);
            System.out.println("半短軸:" + radius[num][1]);
            System.out.println("面積:" + o.Pie());
        } else {
            System.out.println("無此編號");
        }

    }

}

class Circle {

    double r;

    Circle(double radius)//建構子
    {
        r = radius;
    }

    double Pie(int angle) //面積
    {
        return 3.14 * r * r * (angle / 360);
    }

    double Arc(int angle)//弧長
    {
        return 2 * r * (angle / 360);
    }
}

class Oval extends Circle {

    double rshort;

    Oval(double radius_long, double radius_short) {
        super(radius_long);//半長軸繼承Circle的r
        rshort = radius_short;
    }

    double Pie() {
        return (r*rshort*3.14);
    }
}
