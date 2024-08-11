package July.Ex_20072024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        // program to check
        // number positive, negetive, zero
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
         int num= sc.nextInt();
         if(num < 0){
             System.out.println("number is negetive");

         } else if (num > 0) {
             System.out.println("number is positive");

         }else {
             System.out.println("number is zero");
         }


    }
}
