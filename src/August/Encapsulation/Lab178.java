package August.Encapsulation;

//August.EX_100820204.Encapsulation
public class Lab178 {
    public static void main(String[] args) {
        VWOlogin vw= new VWOlogin("admin","abc123");
        System.out.println(vw.Password);
        vw.Password="123";
        System.out.println(vw.Password);

      //  System.out.println(vw.);
      //  System.out.println(vw.getUsername());
// security breached here as any layman is able to change the passwor, so we would be declaring data members as private
// and getter setter is created to access the private data members of the class

    }

}
class VWOlogin {
    public String Username;
    public String Password;




    public VWOlogin(String username, String password) {
        Username = username;
        Password = password;
    }

    }
