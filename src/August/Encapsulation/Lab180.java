package August.Encapsulation;

public class Lab180 {
    public static void main(String[] args) {
        ICICIBank iciciBank= new ICICIBank("Arun", 100l);
        iciciBank.getBal();
        iciciBank.setBal(8689l, true);
        System.out.println(iciciBank.getBal());
        iciciBank.setName("Marya", true);
        System.out.println(iciciBank.getName());


    }
}
