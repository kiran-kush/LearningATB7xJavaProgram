package July.EX_270072024;

import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {
           // array to input usr marks and calculate the average.
           // figure out data type float;
        // user input: scanner class
        // logic: total marks/total subject

        Scanner sc= new Scanner(System.in);
         float marks[]= new float[5];
       /** System.out.println("enter marks of first subject");
        marks[1]= sc.nextFloat();
        System.out.println("enter marks of second subject");
        marks[2]= sc.nextFloat();
        System.out.println("enter marks of third subject");
        marks[3]= sc.nextFloat();
        System.out.println("enter marks of fourth subject");
        marks[4]= sc.nextFloat(); **/
       /**for (int i = 0; i < marks.length; i++) {
            System.out.println("enter subject marks:"+ (i+1));
            marks[i]= sc.nextFloat();
        **/
         int j= 0;
         while(j< marks.length) {
             System.out.println("enter marks:"+marks[j]);
             marks[j]= sc.nextFloat();
             j++;

         }
        float avg= ((marks[1]+marks[2]+marks[3]+marks[4])/5);

        System.out.println("avg is:"+avg);
        }
       //sc.close();

    }

