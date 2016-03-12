/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2_hw3_2;
import java.util.*;
/**
 *
 * @author 子溦
 */
public class Week2_HW3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year,month,day;
        Scanner scanner=new Scanner(System.in);
        System.out.println("輸入年份:");
        year=scanner.nextInt();
        System.out.println("輸入月份:");
        month=scanner.nextInt();
        System.out.println("輸入日期:");
        day=scanner.nextInt();
        Date date=new Date(year,month,day);
        if(date.check()==1)
            System.out.println("西元"+year+"年"+month+"月"+day+"日");
        else
            System.out.println("輸入的年月日不正確");
        
        
    }
}
class Date {

        int Y, M, D;

        Date(int y, int m, int d) {
            Y = y;
            M = m;
            D = d;
        }

        public int check() {
            if (Y <= 0) {
                return 0;
            }
            if ((M == 1 || M == 3 || M == 5 || M == 7 || M == 8 || M == 10 || M == 12) && (D > 0 && D <= 31)) {
                return 1;
            } else if ((M == 4 || M == 6 || M == 9 || M == 11) && (D > 0 && D <= 30)) {
                return 1;
            } else if ((M == 2) && D > 0) {
                if (((Y % 400 == 0) || (Y % 4 == 0 && Y % 100 != 0)) && D <= 29)//閏年
                {
                    return 1;
                } else if (D <= 28) {
                    return 1;
                }
            }
            return 0;
        }
    }

/*
截自網路
public static boolean isValidDate(String sDate) {  
      String datePattern1 = "\\d{4}-\\d{2}-\\d{2}";  
      String datePattern2 = "^((\\d{2}(([02468][048])|([13579][26]))" 
              + "[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|" 
              + "(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?" 
              + "((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?(" 
              + "(((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?" 
              + "((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";  
      if ((sDate != null)) {  
          Pattern pattern = Pattern.compile(datePattern1);  
          Matcher match = pattern.matcher(sDate);  
          if (match.matches()) {  
              pattern = Pattern.compile(datePattern2);  
              match = pattern.matcher(sDate);  
              return match.matches();  
          }  
          else {  
              return false;  
          }  
      }  
      return false;  
 }  
*/
