package August.EX_17082024;

public class Lab197 {
    public static void main(String[] args) {
        String num = "10";
        // int a= (int)num; cant be done

     Integer a= Integer.valueOf(num);
        System.out.println(a);

        // primitive to wrapper
        int a2= Integer.parseInt(num);
        System.out.println(a2);
    }
}
