package iv;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> backStack;
    private Deque<String> forwardStack;
    private String currentPage;

    public BrowserHistory() {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
    }

    public void addPage(String page) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = page;
        forwardStack.clear();
    }

    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
        }
    }

    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
        }
    }

    public String getCurrentPage() {
        return currentPage;
    }
}