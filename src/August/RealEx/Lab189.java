package August.RealEx;

public class Lab189 {
    public static void main(String[] args) {
        Chrome c= new Chrome();
        c.OpenBrowser();
        c.closeBrowser("firefox");
        String s= c.closeBrowser("ff");
        System.out.println(s);
    }
}
