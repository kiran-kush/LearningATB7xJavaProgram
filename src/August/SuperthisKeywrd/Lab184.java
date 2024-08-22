package August.SuperthisKeywrd;

public class Lab184{


}
class student extends person1{

    @Override
    void message(){

        System.out.println("I am a student");

    }
    void display(){

        super.message();
    }
}
class person1{

    void message(){
        System.out.println("I am a person");
    }


}
