package Ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // take user input and check if this is an even or odd number

        // Logic building
        // 1.figure out the input- take input using scanner class
        //  input- nextInt()-> Input
        // 2. data types: int
        //3.do we need conversion or directly
        //4. Rough logic- num%2==0
        //5. Optimize

         Scanner sc= new Scanner(System.in);
        System.out.println("Enter number1:");
          int user_input1= sc.nextInt();
        System.out.println("Enter number2:");
        int user_input2= sc.nextInt();
         // System.out.println("number is->" +user_input2);
          if(user_input1%2 == 0 && user_input2%2==0){

                System.out.println("this is an even number");
            }else{

                System.out.println("This is an odd number");
            }







    }
}
