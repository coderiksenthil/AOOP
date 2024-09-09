package iv;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.addPage("Google");
        browser.addPage("Facebook");
        browser.addPage("YouTube");

        System.out.println(browser.getCurrentPage()); // YouTube

        browser.goBack();
        System.out.println(browser.getCurrentPage()); // Facebook

        browser.goBack();
        System.out.println(browser.getCurrentPage()); // Google

        browser.goForward();
        System.out.println(browser.getCurrentPage()); // Facebook

        browser.goForward();
        System.out.println(browser.getCurrentPage()); // YouTube
    }
}