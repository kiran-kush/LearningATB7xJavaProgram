package August.RealEx;

public class Chrome extends BaseClass {
    @Override
    void OpenBrowser() {
        System.out.println("open chrome browser");
    }

    @Override
    String closeBrowser(String Browser) {
        System.out.println("close browser!!");
          return "";
    }

    @Override
    void TakeScreenshot() {
        System.out.println("OK Taking screenshot");
    }
}
