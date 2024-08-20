package August.Encapsulation;

public class VWLogin {
    private String username;
    private String password;
    private String SigninButton;

    public VWLogin(String username, String password, String signinButton) {
        this.username = username;
        this.password = password;
        SigninButton = signinButton;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSigninButton() {
        return SigninButton;
    }

    public void setSigninButton(String signinButton) {
        SigninButton = signinButton;
    }
}
