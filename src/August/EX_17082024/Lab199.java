package August.EX_17082024;

public class Lab199 {
    public static void main(String[] args) {
        A a= new A();
        System.out.println(A.age);
        A.m2();
        a.m1();
  // static does'nt need object refrence
    }
}
class A{

     int a= 10;
     static int age= 199;
     // Static Initialization block
     static {

         System.out.println("CLass is loaded only once");
     }
     {
        System.out.println("IIB- everytime the object is created");
        // Instance Initialization block
    }
     void m1(){
         System.out.println("This is non static");
         System.out.println(age);

     }
     static void m2(){
         System.out.println("this is static");
         //System.out.println(a); non static can't be used in static function
     }






}
