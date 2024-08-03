package Home_Work_20_July;

public class Second_highest_salary {
    public static void main(String[] args) {
         int salaries[]= {7, 10, 4, 13, 25, 18, 9, 8, 30};
          int max= salaries[0];
          int second=salaries[1];
        for (int i = 0; i < salaries.length; i++) {
             if(max < salaries[i]){
                  second= max;
                  max= salaries[i];
        } else if (second< salaries[i]) {
                    second= salaries[i];

             }

        }
        System.out.println("max salary is:"+ max);
        System.out.println("second maximum salary"+ second);

    }


    }
