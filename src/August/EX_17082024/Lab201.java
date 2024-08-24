package August.EX_17082024;

public class Lab201 {
    //Nested Classes


} class oc{
    Integer a=20;
    void ocm2(){
        System.out.println("oc method");
        //System.out.println(b); not allowed as the outer class cant use inner class data member
    }

  class ic{
    Integer b= 20;
      void m1(){
          System.out.println("ic method");
          System.out.println(a);
      }


  }

}
