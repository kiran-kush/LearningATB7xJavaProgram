package August.Interface.EX2;

import javax.swing.*;

public interface E {
    void StartEngine();
    void StopEngine();

    default  void haltingEnginejustStart(){
        System.out.println("Implement can have concrete methods with default keyword");

    }default  void haltingEnginejustStop(){
        System.out.println("Implement can have concrete methods with default keyword");

    }
   // static void m(){}    interface //cannot have methods with body but with static keyword it is possible

}
