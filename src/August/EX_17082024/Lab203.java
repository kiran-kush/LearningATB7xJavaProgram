package August.EX_17082024;

import jdk.dynalink.beans.StaticClass;

public class Lab203 {
    ABC a = new ABC() {

        @Override
        public void m1() {

        }

        @Override
        public void m2() {

        }

        CBA cba = new CBA() {
            @Override
            void mm() {
                // annonymous class is used o create objects of interface and abstract classes
            }
        };
    };
    static class sc{
        // a type of class
    }

}
interface ABC{
 void m1();
 void m2();


}
abstract class CBA{

    abstract void mm();
}



