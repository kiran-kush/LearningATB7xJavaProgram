package August.SuperthisKeywrd;

public class Lab185 {

}
class person{

     person() {
        System.out.println("I am DC");
    }
    public person(String a) {
        System.out.println("I am PC- A1");
    }

    public person(String a, int b) {
        System.out.println("I am PC2- A2");
    }
}

class Student extends person{
     int a=10;
    public Student(String a) {
        System.out.println("PC- student");

    }

    public Student() {
      // super("kiran");
      //  super();
     // super(10,20);
        System.out.println(this.a);
    }
    public Student(String a, int b){

    }
}
