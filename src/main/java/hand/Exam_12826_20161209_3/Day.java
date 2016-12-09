package hand.Exam_12826_20161209_3;

import java.util.Scanner;

public class Day {
public static void main(String[] args)  throws Exception
{  
	String r;
	int y, m,d;  
    int sum=0;  
    int f=28;  
    Scanner in = new Scanner(System.in);  
    System.out.print("请输入日期:");  
    r = in.nextLine();
   String[] str= r.split("-");
   for(int i=0;i<str.length;i++){
    y=Integer.parseInt(str[0]);
    m =Integer.parseInt(str[1]);
    d = Integer.parseInt(str[2]);
  
    if((y%4==0 && y%100!=0) || y%400==0)  
    {  
        f = 29;  
    }  
      
    switch(m)  
        {  
                case 1:  
                    sum = d;  
                    break;  
                case 2:  
                    sum = 31 + d;  
                    break;  
                case 3:  
                    sum = 31+f+d;  
                    break;  
                case 4:  
                    sum = 31+f+31+d;  
                    break;  
                case 5:  
                    sum = 31+f+31+30+d;  
                    break;  
                case 6:  
                    sum = 31+f+31+30+31+d;  
                    break;  
                case 7:  
                    sum = 31+f+31+30+31+30+d;  
                    break;  
                case 8:  
                    sum = 31+f+31+30+31+30+31+d;  
                    break;  
                case 9:  
                    sum = 31+f+31+30+31+30+31+31+d;  
                    break;  
                case 10:  
                    sum = 31+f+31+30+31+30+31+31+30+d;  
                    break;  
                case 11:  
                    sum = 31+f+31+30+31+30+31+31+30+31+d;  
                    break;  
                case 12:  
                    sum = 31+f+31+30+31+30+31+31+30+31+30+d;  
    }  
   }
    System.out.println(" 你输入的日期为当年的第"+sum+"天");  
}  
}  