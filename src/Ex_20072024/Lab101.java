package Ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
             String name= sc.next();

        System.out.println("Enter your age");
             int age= sc.nextInt();

         System.out.println("enter your salary");
             double sal= sc.nextDouble();
        System.out.print("your name is:"+ name);
        System.out.println("your age is:"+ age);
        System.out.println("your salary is:"+ sal);

    }
}
