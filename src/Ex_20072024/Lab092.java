package Ex_20072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        // switch: for 2+ conditional statement
        // if else(condition)- if, if else, else-> multiple condition
        // which day it is - 1 to 7
        // 3- wed
           Scanner sc= new Scanner(System.in);
        System.out.println("Enter your day:");
            int day= sc.nextInt();
             switch (day){
                 case 1:
                     System.out.println("monday");
                     break;
                 case 2:
                     System.out.println("Tuesday");
                     break;
                 case 3:
                     System.out.println("Wednesday");
                     break;
                 case 4:
                     System.out.println("Thrusday");
                     break;
                 case 5:
                     System.out.println("Friday");
                     break;
                 case 6:
                     System.out.println("Saturday");
                     break;
                 case 7:
                     System.out.println("sunday");
                     break;
                 default:
                     System.out.println("Dont know which day it is ");
             }
        System.out.println("out side the switch");
    }
}
