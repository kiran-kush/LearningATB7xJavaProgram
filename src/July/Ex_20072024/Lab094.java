package July.Ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a character");
           char user_input= sc.next().charAt(0);
         //  switch (user_input){
           //    case 'a':
             //      System.out.println("this is a vowel");
               //    break;
             //  case 'e':
               //    System.out.println("this is vowel");
              //     break;
             //  case 'i':
               //    System.out.println("this is vowel");
                 //  break;
             //  case 'o':
            //       System.out.println("this is vowel");
            //   case 'u':
            //       System.out.println("this is vowel");
            //       break;
              // default:
                //   System.out.println("This is a consonant");
                   switch (user_input){
                       case 'a','e', 'i', 'o', 'u':
                           System.out.println("this is a vowel");
                           break;
                       default:
                           System.out.println("This is a consonant");
           }
    }
}
