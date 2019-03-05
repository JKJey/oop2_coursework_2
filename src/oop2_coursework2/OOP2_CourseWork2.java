package oop2_coursework2;

import java.util.ArrayList;
import java.util.Scanner;

public class OOP2_CourseWork2 {

    public static void main(String[] args) {
ArrayList<String>name=new ArrayList();
      Scanner nam=new Scanner(System.in);
      
      int x = 0;
      while(true){
      System.out.println("Full Name");
      String y=nam.next();
      if(y.toLowerCase().equals("exit"))
          break;
      else{
     int mark[] = new int [6];
     int i;
     String grd;
     float sum=0, avg;
     Scanner scan = new Scanner(System.in);
     System.out.println("1st Course Unit");
     String a =scan.next();
     System.out.println();
     
     System.out.println("2nd Course Unit");
     String b =scan.next();
     System.out.println();
     
     System.out.println("3rd Course Unit");
     String c =scan.next();
     System.out.println();
     
     System.out.println("4th Course Unit");
     String d =scan.next();
     System.out.println();
     
     System.out.println("5th Course Unit");
     String e =scan.next();
     System.out.println();
     
     System.out.println("6th Course Unit");
     String f =scan.next();
     System.out.println();
     
     System.out.print("enter score ");
     for (i=0; i<6; i++)
     {
         mark[i] = scan.nextInt();
         sum = sum + mark[i];
     }
     avg = sum/6;
     System.out.print("your average grade is" +avg);
          name.add(y);
          x++;
    }
    }
 }
}
    
