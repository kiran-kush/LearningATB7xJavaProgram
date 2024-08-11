package July.EX_270072024;

public class Lab147 {
    public static void main(String[] args) {
        int salary[]={17, 20, 8, 5, 25, 17};
        int max= 1;
        int min= salary[0];
        for (int i = 0; i < salary.length ; i++) {
             if(salary[i] > max) {
                 max = salary[i];
                // max2 =max;

             }
              if(min> salary.length){
                  min= salary[i];
              }

        }
        System.out.println("maximum salary is:"+ max);
        System.out.println("minimum salary is:"+ min);
    }
}
