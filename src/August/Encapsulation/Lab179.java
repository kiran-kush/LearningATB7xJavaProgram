package August.Encapsulation;

public class Lab179 {

    // encapsulation: is a method of controlling the accessing of the data member via methods by making them private and
    // TO obtain such mechanism it provides concept of- getter and setter.
    // So, as per this mechanism the data members to be controlled to accessed by class methods
    // all the data members are required to declared as private and are accessed by getter setter.

    public static void main(String[] args) {
        VWOlogin1 vw1 = new VWOlogin1("admin", "pass");
        System.out.println(vw1.getUsername());
        vw1.setUsername("Kiran");
        System.out.println(vw1.getUsername());
        System.out.println(vw1.getPassword());
        vw1.setPassword("123", true);
        System.out.println(vw1.getPassword());


    }
}

    class VWOlogin1 {
        private String Username;
        private String Password;

        public VWOlogin1(String username, String password) {
            Username = username;
            Password = password;
        }

        public String getPassword() {
            return Password;
        }

        public String getUsername() {
            return Username;
        }

        public void setPassword(String password, boolean isAuth) {
            if (isAuth == true) {
                Password = password;
            } else {
                System.out.println("Not Allowed");
            }
        }
            public void setUsername (String username){
                Username = username;
            }


        }

