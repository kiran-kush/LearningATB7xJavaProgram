package August.RealEx;

abstract public class BaseClass extends GrandBaseClass {
    // Web automation
    // Single inheritence
    //hide functionality of open and close browser

    abstract void OpenBrowser();
    abstract String closeBrowser(String Browser);

    @Override
    void TakeScreenshot() {
        System.out.println("OK Taking Screenshot!!!");
    }
}
