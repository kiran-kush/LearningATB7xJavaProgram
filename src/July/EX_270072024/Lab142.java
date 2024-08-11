package July.EX_270072024;

public class Lab142 {
    public static void main(String[] args) {
        final int [] age= new int[4];// final is applied on the array length , length can't be updated.
        age[3]= 70;
        System.out.println(age[3]);
        final int a= 10;
       // a=90; not possible
    }
}
