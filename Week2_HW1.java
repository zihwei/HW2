/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_hw1;
/**
 *
 * @author 子溦
 */
public class Week2_HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hr=4,min=23,sec=45;
        int hr1=13,min1=54,sec1=23;
        int total_time=0;
        int first_time=0,last_time=0;
        
        first_time=(hr*60*60)+(min*60)+sec;
        last_time=(hr1*60*60)+(min1*60)+sec1;
        total_time=last_time-first_time;
        System.out.println("4點23分45秒到13點54分23秒之間的總秒數 : "+total_time+"秒");
        System.out.println();
        //--------------------------------
        int array[]={10,8,7,5,3};
        double total=0;
        System.out.println("陣列內容:");
        for(int a:array)
        {
            System.out.print(a+" ");
            total+=a;
        }
        System.out.println();
        System.out.println("總和:"+total+"；平均:"+total/array.length);
        
    }
    
}
