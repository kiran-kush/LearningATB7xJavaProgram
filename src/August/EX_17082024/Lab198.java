package August.EX_17082024;

public class Lab198 {
    public static void main(String[] args) {
        //Integer i= new Integer(4); This is was allowed before the java 9.
        // but in later versions
        Integer i= 42;// we can directly user it.

        Double d= 3.14;// Heap
        double d1= 3.14;// continous memory
        System.out.println(d);
        System.out.println(d1);
        // they look same but in the memory, d is stored in the heap area,
        // d1 is primitve data type and is stored in the continous memory.
        // so as java guys wants us to use everything as a object
        // it is preferable to use wrapper class

        String s= "Pramod";// SCP
        String s1= new String("PRAMOD");// Heap

    }
}
