package iv;

public interface BrowserInterface {
    void addPage(String page);
    void goBack();
    void goForward();
    String getCurrentPage();
}