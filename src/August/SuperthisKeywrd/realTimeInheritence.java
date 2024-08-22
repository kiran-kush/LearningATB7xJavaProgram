package August.SuperthisKeywrd;

public class realTimeInheritence {
    public static void main(String[] args) {
        Baseclass t1= new Testcase1();// dynamic dispatch
                  t1.setBrowser("Chrome", true);
                  t1.openBrowser();
                  t1.closeBrowser();

    }

}
 class Testcase1 extends Baseclass{
      @Override
      public void setBrowser(String browser, boolean IsAuth) {

              super.setBrowser(browser,IsAuth);

             }
 }
 class Baseclass {

     private String browser;

     public String getBrowser() {
         return browser;
     }

     public void setBrowser(String browser, boolean IsAuth) {
         if (IsAuth) {
             this.browser = browser;
         } else {
             System.out.println("Not Allowed");
         }
     }

     void openBrowser(){

         System.out.println("ChromeBrower!!");
     }
     void openBrowser(String browserName){

         System.out.println("Open Browser in:"+browserName);
     }

     void closeBrowser(){

         System.out.println("closed Browser!!");
     }

 }
