package Ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter your score");
         int score = sc.nextInt();
          char grade = 'f';
         if(score >= 90 && score <= 100){
             grade= 'A';
         } else if (score >= 80 && score <= 89){

            grade='B';
            } else if (score >= 70 && score <= 79) {

            grade= 'C';
             } else if (score >= 60 && score <= 69){
            grade= 'D';
    } else if (score >= 50 && score <= 59) {
            grade= 'E';
        }else{
            System.out.println("you are fail");
        }



        System.out.println("Your grade is->"+grade);
         sc.close();

    }
}
