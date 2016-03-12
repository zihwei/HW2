/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_hw3_1;

import java.util.*;

/**
 *
 * @author 子溦
 */
public class Week2_HW3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] radius = new double[100];
        double radius_temp;
        int count = 1;
        int num;
        double angle;

        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入半徑以產生不同的圓形( 0 結束)");
        while (true) {
            System.out.println("編號" + count + "半徑:");
            radius_temp = scanner.nextDouble();
            if (radius_temp != 0) {
                radius[count] = radius_temp;
                count++;
            } else {
                break;
            }
        }
        System.out.println("輸入完成");
        System.out.print("輸入圖形編號:");
        num = scanner.nextInt();
        if (num < count && num >= 1) {
            System.out.print("輸入角度:");
            angle = scanner.nextDouble();
            Circle c = new Circle(radius[num], angle);
            System.out.println("半徑:" + radius[num]);
            System.out.println("角度:" + angle);
            System.out.println("弧長:" + c.Arc());
            System.out.println("面積:" + c.Pie());
        } else {
            System.out.println("無此編號");
        }
    }

}

class Circle {

    double r;
    double angle;

    Circle(double radius, double angle)//建構子
    {
        r = radius;
        this.angle = angle;
    }

    double Pie() //面積
    {
        return 3.14 * r * r * (angle / 360);
    }

    double Arc()//弧長
    {
        return 2 * r * (angle / 360);
    }

}
