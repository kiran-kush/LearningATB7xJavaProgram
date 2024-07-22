package EX_14072014;

public class Lab_0076 {
    public static void main(String[] args) {
        String s1= "pramod";
        //String s1= p/r/a/m/o/d
        //           0|1|2|3|4|5
        System.out.println(s1.charAt(5));
           s1.concat("Dutta");// concatination is happening but we are not storing the value, so s1, value will not be updated.
        System.out.println(s1);
        String s2=s1.concat("dutta");
        System.out.println(s2);

    }
}
