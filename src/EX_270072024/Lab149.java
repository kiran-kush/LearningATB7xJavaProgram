package EX_270072024;

public class Lab149 {
    public static void main(String[] args) {
        int [][]array_2d= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8,  9}
        };
           // r= 3 range- 0- 2
           // c= 3- 0-2
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j <array_2d[i].length; j++) {
                // array_2d[i].length- loop will go till the length of row
                System.out.println(array_2d[i][j]);
                
            }
            
        }


    }
}
