package Ex_20072024;

import java.util.Scanner;
public class Lab088 {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a= sc1.nextInt();
        System.out.println("value of a->" + a);
       // Scanner sc2= new Scanner(System.in);
        System.out.println("Enter value of b:");
        int b= sc1.nextInt();
        System.out.println("value of b"+b);
      //  Scanner sc3= new Scanner(System.in);
       // System.out.println("enter value of c->");
      //  int c= sc3.nextInt();
       // System.out.println("enter value of c" +c);
        if(a > b){
            System.out.println("a is greater");


        } else if (b > a) {
            System.out.println("B is greater");
            
        } else {
            System.out.println("both are equal");
        }
            }
}
