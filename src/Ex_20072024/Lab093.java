package Ex_20072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Browser name");
         String browser= sc.next();
         browser= browser.toLowerCase();
          switch (browser){
              case "chrome":
                  System.out.println("your browser is chrome");
                  break;
              case "edge":
                  System.out.println("your browser is Edge");
                  break;
              case "safari":
                  System.out.println("your browser is Safari");
                  break;
              case "firefox":
                  System.out.println("Your browser is Firefox");
                  break;
              default:
                  System.out.println("no idea what browser it is");

          }



    }
}
