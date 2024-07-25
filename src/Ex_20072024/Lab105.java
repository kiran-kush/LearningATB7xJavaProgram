package Ex_20072024;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the character");
         char ch= sc.next().charAt(0);
         if(ch == 'a' || ch== 'e'|| ch== 'i'|| ch== 'o' || ch== 'u')
         {
             System.out.println("this is a vowel");

         }else{
            System.out.println("this is a consonant");
        }
    }
}
