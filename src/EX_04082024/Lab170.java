package EX_04082024;

import java.util.Scanner;

public class Lab170 {

    public static void main(String[] args) {
      /*  BankAccount ba= new BankAccount();
        System.out.println(ba.Bank_name);
        System.out.println(ba.BankCode);
        System.out.println(ba.balance);
        BankAccount Ba2= new BankAccount();
        System.out.println(Ba2.balance);
        System.out.println(Ba2.Bank_name);
        System.out.println(Ba2.BankCode);*/
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter bank name:");
         String bName= sc.next();
        System.out.println("Enter bank code:");
         String bCode= sc.next();
        System.out.println("Enter bank balance:");
         int blnce= sc.nextInt();

        BankAccount ba3= new BankAccount(bName, blnce,bCode);

          ba3.printDetails();
          sc.close();


            }
}
