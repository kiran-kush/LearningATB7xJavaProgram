package EX_04082024;

public class Lab165 {
    // int age= 45;// instance varibale != global
                   // there is no concept of global variable in java
       int e= 45;
     void age(){
         System.out.println(e);

     }
     void f1(){
         int e= 10;
         System.out.println(e);
        // System.out.println(e);

     }
        void f2(){
            System.out.println();// age can be used here but not e as e is local variable in f1
            // age is declared as instance variable.
            // life of age is withing the code or class
            //life to e is within the f1 func()




        }
}
