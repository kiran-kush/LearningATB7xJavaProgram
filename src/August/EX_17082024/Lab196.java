package August.EX_17082024;

public class Lab196 {
    public static void main(String[] args) {
        // primitive to wrapper
        int a= 10;
        Integer c= a;
        int d= 40;
        System.out.println(c.compareTo(d));// extra utilities are added to the variable


        // wrapper to primitve
        Integer i= 50;// auto boxing- Integer i always have a integer value.
        int value= i;// unboxing the Integer - int
        System.out.println(value);// extra utilities has been removed from the variable
    }
}
