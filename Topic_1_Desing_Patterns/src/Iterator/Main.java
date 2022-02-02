package Iterator;

/** Use to access to the container's elements
 * History. "Go back button"
 */
public class Main {
    public static void main(String[] args) {

        BrowseHistory history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            String url = iterator.current();
            System.out.println(url);
            iterator.next();

        }
    }


}
