package August.Loan;

import EX_04082024.singelInheritence.son;

public class Lab189 {
    public static void main(String[] args) {
         Son s1= new Son();
         s1.loan50();
         // In abstraction: we hide the functionality of one class and methods.
        // which is later defined by child class
        // eg- just like father son reltionship, where father has a loan which is later paid by son
        // abstraction class is allowed to have abstracted methods.
        // abstract classes object can't be created.
        //Father f= new Father();// an error father is abstract and can't be instantiated is occurred
        Father f= new Son();// dynamic dispatch is possible
        f.loan25k();
        f.loan50();
        // the class which having abstracted methods are called non concrete class.
        // class and methods having no abstract method are called concrete classes or methods
        // classes have atleast one abstract methods called as non concrete classes.
        // abstract methods can have return type.
        // A concrete class can not have abstract method.
        // A concrete class objects can be created but not the abstract one.



    }

}
