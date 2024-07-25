package Home_Work_20_July;

import java.util.Scanner;

public class Fizz_Buzz {
    //  FizzBuzz Test:
    //Write a program that prints numbers from 1 to 100.
    // However, for multiples of 3, print "Fizz" instead of the number,
    // and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        //System.out.println("Enter a number:");
                     int num= 100;
              for(int i = 0; i <= num; i++){
                  if(i % 3 == 0 && i % 5 == 0){
                      System.out.println("Fizz Buzz");
                  } else if(i % 3 == 0){
                   System.out.println("fizz");

               } else if(i % 5 == 0){
                   System.out.println("Buzz");

               }else {
                      System.out.println(i);
                  }
           }

    }
}
