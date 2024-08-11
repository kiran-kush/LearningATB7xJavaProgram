package July.EX_280072024;

public class Animal {
    String name = "Lol";
    String color;

    void walk(){

    }
    void talk(){

    }

    public static void main(String[] args) {

        Animal aniref1= null;// one time it will load the class in the memory,
                             // aniref will ref to null in heap
        Animal aniref2= new Animal();// a new object will be created and aniref2 will refer to it.
        Animal aniref3= new Animal();// a new object will be created an aniref3 will refer to it.
        Animal aniref4= aniref2; // aniref4 will refrence to aniref2,
                                // only two objects will be created.
        System.out.println(aniref2.name);




    // nothing will load in the memory untill there is no main present in the code


    }
}
