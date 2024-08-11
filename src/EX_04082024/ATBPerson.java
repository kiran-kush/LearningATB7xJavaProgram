package EX_04082024;

public class ATBPerson {

    String name;
    long  phone;

    ATBPerson(){

        System.out.println("an object is created");


    }
    ATBPerson(String namegiven){

       this.name= namegiven;// namegiven variable value is assigned to instance variable of the class 'name';
       //this belongs to this/current class

    }
    ATBPerson(String namegiven, long phonenumber){

         this.name= namegiven;
         this.phone= phonenumber;
    }
    ATBPerson(long PhoneNumber){
        this.phone=PhoneNumber;
    }

}
