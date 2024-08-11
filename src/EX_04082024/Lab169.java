package EX_04082024;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson p0= new ATBPerson();
        ATBPerson p = new ATBPerson("Pramod");
        ATBPerson p1= new ATBPerson("Kiran", 698686989);
        ATBPerson p2= new ATBPerson(60970970);
        ATBPerson p3= new ATBPerson("Praveen");

       // p.name= "Pramod";
        System.out.println(p0.name);
        System.out.println(p.name);
        System.out.println(p.phone);
        System.out.println( p2.phone);
        System.out.println(p3.phone);
        // three objects will be created here and


    }

}
