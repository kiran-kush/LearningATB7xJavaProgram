package July.EX_14072014;

public class Lab_0050 {
    public static void main(String[] args) {
        byte a= 10;
        byte b= 20;
        int c= a+b;// always use bigger container to store the result of two operands as result sometime may cross the limit.
        char a1= 'A';// 65
        char b1= 'B';// 66
        int c1 = a1+b1;// ASCII value of A and B would be added; 65+66= 131
        System.out.println(c1);// chars are always integer only and they have their respective integer values
        System.out.println('A'== 65);

    }
}
