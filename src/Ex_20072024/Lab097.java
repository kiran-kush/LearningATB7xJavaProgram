package Ex_20072024;

public class Lab097 {
    public static void main(String[] args) {
        int itemcode= 010;
         switch (itemcode){
             case 001, 002, 003:
                 System.out.println("it is an electronic gadget");
                 break;
             case 004, 005, 006:
                 System.out.println("this is a mechanical gadget");
                  break;
             default:
                 System.out.println("this is not a gadget");



         }

    }
}

