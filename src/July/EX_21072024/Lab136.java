package July.EX_21072024;

public class Lab136 {
    public static void main(String[] args) {
        // funtion: block of code which can be reused.
        // types: inbuilt and user defined
        // inbuilt:
        // Two component:
        // Defined
        // call the function
        // call the function:
        // types of functions:
        // no argument no return type
        // without parameter but return type
        // with parameter but no return type.
        //with argument with return type
        System.out.println("-----------------");
         func_type1();
        System.out.println("-----------------");
         String name= func_type2();

        System.out.println(name);
        System.out.println("-----------------");
        func_type3("Kiran");
        System.out.println("-----------------");
        int result= func_type4(4, 5);
        System.out.println(result);


    }   // defined
     // function with no parameter no return type
    static void func_type1() {

        System.out.println("No parameter no return type");
    }
    // Without parameter but return type
    static String func_type2() {

        System.out.println("without parameter but return type");
        return "Kiran";

    }
    // Function with parameter but no return type
    static void func_type3(String name){

        System.out.println("you have shared:"+name);
        System.out.println("Function with parameter but no return type");
    }
  // function with parameter and with return type
         static int func_type4(int a, int b){
             System.out.println("function with parameter and with return type");
                   return a+b;
         }
}
