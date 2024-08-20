package August.Encapsulation;

public class ICICIBank {
    private String name;
    private Long bal;

    public ICICIBank(String name, Long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAuth) {
        if(isAuth){
        this.name = name;
    }
        else{
            System.out.println("not Allowed");
      }
    }
    public Long getBal() {
        return bal;
    }

    public void setBal(Long bal, boolean isAuth) {
        if(isAuth){

        this.bal = bal;
    }else{
            System.out.println("not allowed");
        }
    }

}
