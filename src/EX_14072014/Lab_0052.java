package EX_14072014;

public class Lab_0052 {
    public static void main(String[] args) {
        // type casting- source and destination conversion
         byte b= 10;
        // int b1= b;// type casting (implicitly done by JVM, also called widening)
                   // as we are transferring value from small basket to big basket.
       //int b1= (int)b; // safe conversion and do not have to mention
       // System.out.println(b1);
        //narrowing- explicity done by the user to hold large value in small container, and is sometimes results in data loss
        int a= 300;
        byte b2= (byte)a;
        System.out.println(b2);



    }
}
