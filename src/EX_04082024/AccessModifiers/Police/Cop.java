package EX_04082024.AccessModifiers.Police;

public class Cop {

    protected int gun;
    protected String idCard;
    protected Cop(int gun){
       this.gun= gun;
       }
     protected void canIShoot(){

         System.out.println("Yes you can!!");
     }

}
