package July.Home_Work_20_July;

import java.util.Scanner;

public class Triangle_Classifier {
  //  ✅ Triangle Classifier:
// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter side 1");
       int side1= sc.nextInt();
  System.out.println("enter side 2");
       int side2= sc.nextInt();
  System.out.println("enter side 3");
       int side3= sc.nextInt();
    String triangle_type= "";
   if(side1 == side2 && side2== side3){

      triangle_type= "Equilateral";
   } else if (side1 == side2 || side2== side3) {
           triangle_type= "Isosceles";
        } else {
            triangle_type= "scalene";


   }
        System.out.println(triangle_type);

}
}

