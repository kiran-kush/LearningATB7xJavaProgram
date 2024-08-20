package August.poly.Overriding;

public class Lab182 {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.bark();
        Hound hound= new Hound();
        hound.bark();
        Dog dog_ref= new Hound();
        dog_ref.bark();
    }
}
