package EX_21072024;

public class Lab122 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            if(i == 5){
                continue;
            }
                System.out.println("After!!");// after was not printed with only the case when i is equal to 5

        }
    }
}
