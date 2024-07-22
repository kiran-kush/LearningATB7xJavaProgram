package EX_14072014;

import java.sql.SQLOutput;

public class Lab_078 {
    public static void main(String[] args) {
        String password= "Kiran@123";
        String U_Pass= password.toLowerCase();
        System.out.println(password==U_Pass);
        System.out.println(password.equals(U_Pass));
        System.out.println(password.equalsIgnoreCase(U_Pass));
        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('r'));
        System.out.println(password.length());




    }
}
