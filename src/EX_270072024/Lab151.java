package EX_270072024;

public class Lab151 {
    public static void main(String[] args) {
        String s1= "KIRan";
               s1= "Kushwah";// two string will be created in SCP.
        String s2= new String("Kiran");
        System.out.println(s2.toLowerCase());

        // first one saves the strings in SCP (string constant pool)
        // Second way: second way string stored in Heap area of JVM
        // String is immutable in nature which means there can be multiple coy of the string in heap.
        int index= s1.indexOf('R');
        System.out.println(index);
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.charAt(3));




    }
}
