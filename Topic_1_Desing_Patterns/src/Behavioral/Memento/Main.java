package Behavioral.Memento;
/**Restore an object to its previous state
 */
public class Main {
    public static void main(String[] args) {
    Editor editor = new Editor();
    History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        editor.setContent("d");
        history.push(editor.createState());

        editor.setContent("e");
        history.push(editor.createState());

        editor.setContent("f");
        history.push(editor.createState());


        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
