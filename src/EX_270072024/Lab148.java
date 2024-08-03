package EX_270072024;

public class Lab148 {
    public static void main(String[] args) {

        // array
        // single dimensional
        // multi dimensional
        // single dimension
        //  int [] age= new int[2];
        // multi dimensional array: 2d, 3d, and more
        int[][] array_2d  = new int[3][3];
        // 0|0|0|( matrix- 00, 01, 02)
        // 1|1|1|( matrix- 10, 11, 12)
        // 2|2|2|( matrix- 20, 21, 22)
        array_2d[0][1] = 12;//( matrix- 00, 01, 02)- 12 will be stored at 01 place
        array_2d[1][0] = 34;//

        System.out.println(array_2d[0][1]);
        System.out.println(array_2d[1][0]);


    }




}
