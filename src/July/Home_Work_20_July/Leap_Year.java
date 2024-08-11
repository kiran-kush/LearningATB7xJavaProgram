package July.Home_Work_20_July;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any year");
        int year= sc.nextInt();
        if(year % 4 == 0 || year % 400 == 0){
            System.out.println("this is a leap year");

        }else{
            System.out.println("Not a leap year");

        }
    }
}
