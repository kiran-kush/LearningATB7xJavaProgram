package July.EX_270072024;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {
        // array- new operator
        int marks[]= new int[3];// 3 in length
        // index starts with 0
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc= new Scanner(System.in);
       // System.out.println("enter first element of array:");
       // marks[0]=sc.nextInt();
        marks[0]= 92;
        marks[1]=93;
        marks[2]=95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(i);
            System.out.println(marks[i]);
            //System.out.println(marks[i]);

            String weekDays[]= {"sunday","monday", "Tuesday","Wednesday", "Thrusday", "Friday"};
            for (int j = 0; j < weekDays.length; j++) {

            }

        }

    }
}
