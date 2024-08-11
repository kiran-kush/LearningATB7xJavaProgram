package EX_04082024.multilevelInheritence;

public class Lab174 {
    public static void main(String[] args) {
       // multilevel-> Gf-> f-> child
        //
        Child c1= new Child();
        c1.c();
        c1.home();// if func name is same in all the level then, c-> f-> g
        c1.f();
        c1.g();
        c1.f();
        father f= new father();
        f.g();
        f.home();



    }

}
