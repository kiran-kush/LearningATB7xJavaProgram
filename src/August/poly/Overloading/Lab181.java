package August.poly.Overloading;

public class Lab181 {
    public static void main(String[] args) {
        Mathoperations mo= new Mathoperations();

        int c= mo.add(10, 20);
        System.out.println(c);
        float f= mo.add(10, 10.5f);
        System.out.println(f);
        float l= mo.add(1008l, 29790l);
        System.out.println(l);
        String s= mo.add("ram", "Shyam");
        System.out.println(s);





    }

}
