package State;

/**Allows an object to behave differently when its state changes
 *
 */
public class Main {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
