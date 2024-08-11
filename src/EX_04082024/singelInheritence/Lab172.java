package EX_04082024.singelInheritence;

public class Lab172 {
    public static void main(String[] args) {

        son s= new son();
        s.bhk3();
        s.bhk2();// is not possible as we didn't extend father in son class.
        s.bhk2();// is possible because we have extended father into son
      father f= new father();
      f.bhk2();// father is only allowed to access his property not son's
        // con can use father's surname but father can not have son's surame

    }


}
