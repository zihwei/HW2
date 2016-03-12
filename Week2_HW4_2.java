/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_hw4_2;
import java.util.*;
/**
 *
 * @author 子溦
 */
public class Week2_HW4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int op;
        Shape[] list=new Shape[100];
        int count=0;
        double temp,temp1;
        while(true)
        {
            System.out.println("選項 1.圓形 2.三角形 3.橢圓形 4.矩形 -1.結束");
            op=scanner.nextInt();
            if(op==1)
            {
                System.out.println("輸入半徑");
                temp=scanner.nextDouble();
                if(temp>0)
                {
                    list[count]=new Circle(temp);
                    count++;
                }
                else
                    System.out.println("輸入錯誤");
            }
            else if(op==2)
            {
                System.out.println("輸入底邊");
                temp=scanner.nextDouble();
                System.out.println("輸入高");
                temp1=scanner.nextDouble();
                if(temp>0 && temp1>0)
                {
                    list[count]=new Triangle(temp,temp1);
                    count++;
                }
                else
                    System.out.println("輸入錯誤");
            }
            else if(op==3)
            {
                System.out.println("輸入半長軸");
                temp=scanner.nextDouble();
                System.out.println("輸入半短軸");
                temp1=scanner.nextDouble();
                if(temp>0 && temp1>0 && temp>temp1)
                {
                    list[count]=new Oval(temp,temp1);
                    count++;
                }
                else
                    System.out.println("輸入錯誤");
            }
            else if(op==4)
            {
                System.out.println("輸入邊長1");
                temp=scanner.nextDouble();
                System.out.println("輸入邊長2");
                temp1=scanner.nextDouble();
                if(temp>0 && temp1>0)
                {
                    list[count]=new Rectangle(temp,temp1);
                    count++;
                }
                else
                    System.out.println("輸入錯誤");
            }
            else if(op==-1)
                break;
            else
                System.out.println("輸入錯誤");
        }
        for(int i=0;i<count;i++)
        {
            System.out.print("編號"+(i+1)+":");
            list[i].show();
            System.out.println();
        }
        
    }
    
}
abstract class Shape
{
    abstract  double area();
    abstract void show();
}

class Circle extends Shape
{
    double r;
    Circle(double radius)
    {
        r=radius;
    }
    double area()
    {
        return r*r*3.14;
    }
    void show()
    {
        System.out.println("圓形，面積:"+area());
    }
}
class Triangle extends Shape
{
    double base,high;
    Triangle(double base,double high)
    {
        this.base=base;
        this.high=high;
    }
    double area()
    {
        return (base*high/2);
    }
    void show()
    {
        System.out.println("三角形，面積:"+area());
    }
}
class Oval extends Shape
{
    double rlong,rshort;
    Oval(double radius_long,double radius_short)
    {
        rlong=radius_long;
        rshort=radius_short;
    }
    double area()
    {
        return rlong*rshort*3.14;
    }
    void show()
    {
        System.out.println("橢圓形，面積:"+area());
    }
}
class Rectangle extends Shape
{
    double x,y;
    Rectangle(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    double area()
    {
        return x*y;
    }
    void show()
    {
        System.out.println("矩形，面積:"+area());
    }
}
//圓形、橢圓形、矩形，或三角形