package August.RealEx;

public class Firefox extends BaseClass {

    @Override
    void OpenBrowser() {
        System.out.println("open firefox");
    }

    @Override
    String closeBrowser(String Browser) {
        System.out.println("closing the browser");
        return "";
    }

    @Override
    void TakeScreenshot() {
        System.out.println("Ok Taking Screenshot!!");
    }
}
