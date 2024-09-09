package iv;

public class Browser {
    private BrowserHistory history;

    public Browser() {
        history = new BrowserHistory();
    }

    public void addPage(String page) {
        history.addPage(page);
    }

    public void goBack() {
        history.goBack();
    }

    public void goForward() {
        history.goForward();
    }

    public String getCurrentPage() {
        return history.getCurrentPage();
    }
}