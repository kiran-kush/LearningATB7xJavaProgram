package August.EX_17082024;

public class Lab202 {
    public static void main(String[] args) {
        car c= new car("Lambo");
        c.drive();
        System.out.println(c.make);
        // to access the inner class object
       // car.gearbox cg= c.new gearbox();
       // cg.m2();
    }
// to hide the functionality
}
class car{
    String make;

    public car(String make) {
        this.make = make;
    }
    void drive(){
        System.out.println("You can drive car");
    }
    class gearbox{

        void m2(){
            System.out.println("m2");
        }

    }
    class nutbolt{

    }
}
