package July.EX_21072024;

public class Lab123 {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {// i value from 0 to 50, 51 times
            //System.out.println(i);
            if(i %2== 0){
                System.out.println("even number->"+ i);
                continue;// i value is skipped and odd number will be printed
            }
            System.out.println("odd!!->"+ i);// after was not printed with only the case when i is equal to 5

        }
    }
    }

