package EX_04082024.MultipleInheritence;

public class Lab175 {
    public static void main(String[] args) {
        Child c= new Child();
        c.money();
        c.home();
        c.c();// inheriting both and mother properties is not possible in java
    }
}
