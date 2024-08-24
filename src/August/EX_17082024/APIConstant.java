package August.EX_17082024;

public enum APIConstant {
         BaseUrl("https://app.vwo.com/#/login"),
         directoryPage("https://app.vwo.com/#/signup");

    private final String name;
      APIConstant(String name){
          this.name= name;

      }

    public String getName() {
        return name;
    }
}
