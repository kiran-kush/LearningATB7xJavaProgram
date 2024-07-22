package EX_14072014;

public class Lab_0067 {
    public static void main(String[] args) {
          String s1= "Kiran";
          String s2= s1;// only one string is created in string constant pool
          String s3= s2.toUpperCase();// s3 string is created in pool;
        System.out.println(s3);
        System.out.println(s1);

    }
}
