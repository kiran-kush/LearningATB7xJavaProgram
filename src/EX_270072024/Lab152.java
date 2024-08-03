package EX_270072024;

public class Lab152 {
    public static void main(String[] args) {
         StringBuffer sb= new StringBuffer("Parmod");
         sb.append("Dutta");
         // only on string is created in the memory. like firstly, Parmod will be created
         // Dutta will replace pramod with and Pramod will get removed from the memory.
         //
         StringBuilder sb1= new StringBuilder("amit");
         sb1.append('s');

         // mostly string builder class is used as it is not thread safe.
        // and people love it :)

    }
}
