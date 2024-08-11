package July.EX_21072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        // coding ques
        // factorial
        // fact 5= 5*4*3*2*1= 120
        // fact 1= 1*1=1
        // fact 3= 3*2*1=6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n= sc.nextInt();
          int fact= 1;
          for (int i= 1; i<=n; i++){
                 fact=fact*i;
                // fact=1, fact-1*i=1
                //fact= 1, fact-1*i=2= 2
               // fact=2,  fact-2*i=3= 6
              // fact=24,   fact-6*i=4= 24



          }
        System.out.println(fact);
     sc.close();

    }
}
