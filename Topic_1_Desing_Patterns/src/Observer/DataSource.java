package Observer;

public class DataSource extends Subject{//Now this is an observable object
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
