package July.EX_14072014;

public class Lab_0070 {
    public static void main(String[] args) {
         String s1= "The testing academy";
         String s2=  "The testing academy" ;
         // only one string will be created as the content is same.

        //String s3= new String ("The testing academy");
       // String s4= new String ("the testing academy");
        // two different strings are created
       // System.out.println(s1==s2);// == refers to the refrence of the string variable, are they pointing to the same?
        //System.out.println(s1.equals(s2));// equals checks the content
         String s3= new String("the testing academy");
        System.out.println(s1==s3);// == checks for the refrence, if they are pointing to same location or not
        System.out.println(s1.equals(s3));// == checks for the content, if they are pointing to same location or not



    }
}
