package EX_04082024.AccessModifiers.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop c= new Cop(100);
        //c.CanIshoot(); this is not allowed as  we have declared it as private.
        // so access it by jr cop we should declare it a protected as it is of same folder
        // ad theif will not be allowed as it is of different folder
        // so to access it by jr cop we have now declared all the methods and data members of the cop class as protected
        System.out.println(c.gun);
        c.canIShoot();


    }

}
