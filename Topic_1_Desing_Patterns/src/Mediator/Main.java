package Mediator;

/**
 * Many objects that need to talk to each other
 * Through a specific object
 */
public class Main {
    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
