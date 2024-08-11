package July.EX_14072014;

public class Lab_056 {
    public static void main(String[] args) {
        // increment ++/ decrement --
        // pre, post
        //
        //pre increment operands++
        // value is incremented first and then stored in the result
       //  int a_pre= 10;
      //   int b= ++a;// a= a+1
      //     value of b= 11 and value of a= 11
      //  System.out.println(a);
       // System.out.println(b);
       //   ++a_pre;
      //  System.out.println(a_pre);
        // exp= 11,  valu of a after increment= 11

        // Post: value is stored in the result first and  incremented later

        int a_post = 10;
        int b1= a_post++;
        System.out.println(b1);
        System.out.println(a_post);









    }
}
