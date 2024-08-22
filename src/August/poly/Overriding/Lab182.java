package August.poly.Overriding;

public class Lab182 {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.bark();
        Hound hound= new Hound();
        hound.bark();
        Dog dog_ref= new Hound();// only common methods in both classes will be called by this way.
        dog_ref.bark();// overridden functions are accessible
       // dog_ref.walk();// uncommon method will not be accessible
    }
    // if parent and child class have same a method with same name, then @override annotation is used to
    // ovrride keyword is used to avoid compile time ambiguity.
    // and every time when an object of child class is accessing the method, local method will be given priority/

}
