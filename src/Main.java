import com.yash.thread.OS;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        OS windows = new OS("Terminal");
        OS chrome = new OS("chrome");
        OS vscode = new OS("VSCode");
        windows.start();
        chrome.start();
        vscode.start();
    }
}