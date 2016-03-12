/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_hw2;

import java.io.*;
import java.util.*;

/**
 *
 * @author 子溦
 */
public class Week2_HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String name;
        int year = 0, month = 0, date = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入姓名:");
        name = scanner.nextLine();
        System.out.println("輸入生日");
        System.out.print("西元年:");
        year = scanner.nextInt();
        System.out.print("月:");
        month = scanner.nextInt();
        System.out.print("日:");
        date = scanner.nextInt();

        System.out.println(name + " 生日:" + (year - 1911) + "年" + month + "月" + date + "日");

//-------------------------------------------------
        float A = 0, B = 0;
        int op;

        System.out.print("輸入數字A:");
        A = scanner.nextFloat();
        System.out.print("數字B:");
        B = scanner.nextFloat();
        System.out.print("輸入選項 (1)+ (2)- (3)* (4)/ :");
        op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.println(A + "+" + B + "=" + (A + B));
                break;
            case 2:
                System.out.println(A + "-" + B + "=" + (B - A));
                break;
            case 3:
                System.out.println(A + "*" + B + "=" + (A * B));
                break;
            case 4:
                if (B != 0) {
                    System.out.println(A + "/" + B + "=" + (B / A));
                } else {
                    System.out.println("Error");
                }
                break;
            default:
                System.out.println("Error!");
        }
//-------------------------------------------------
        int year1 = 0;
        System.out.println("輸入年份:");
        year1 = scanner.nextInt();
        System.out.println(year1 + "年以前的閏年有:");
        for (int i = year1; i >= 0; i--) {
            if (i % 400 == 0) {
                System.out.print(i + " ");
            } else if (i % 4 == 0 && i % 100 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

//-------------------------------------------------
        String[] student = new String[100];
        int[] grade = new int[100];//學生編號從1開始
        int op1 = 0, op2 = 0;
        int count = 1;
        int num;
        String n;

        while (true) {
            System.out.println("選項 (1)輸入學生姓名和成績 (2)尋找學生資料 (-1)結束");
            op1 = scanner.nextInt();
            if (op1 == 1) {
                while (true) {
                    System.out.println("(1)輸入姓名和成績 (2)結束");
                    op2 = scanner.nextInt();
                    if (op2 == 1) {
                        try {
                            System.out.print("編號" + count + "->");
                            System.out.println("姓名:");
                            student[count] = scanner.next();
                            System.out.println("成績:");
                            grade[count] = scanner.nextInt();
                            count++;
                        } catch (Exception e) {
                            System.out.println("NumberFormatException");
                            scanner.next();
                            if (count >= 0) {
                                count--;
                            }
                        }
                    } else if (op2 == 2) {
                        break;
                    } else {
                        System.out.println("無此選項");
                    }
                }
            } else if (op1 == 2) {
                System.out.println("輸入編號:");
                num = scanner.nextInt();
                if (num <= count - 1 && num > 0) {
                    System.out.println("學生姓名:" + student[num] + " 成績:" + grade[num]);
                } else {
                    System.out.println("無此編號");
                }
            } else if (op1 == -1) {
                break;
            } else {
                System.out.println("Error.");
            }

        }
    }

}
