package topic_0_java_basics;


public abstract class GeneralProcess {
    private int id;
    int minValue;
    int maxValue;
    public static int storage;
    private static int count = 1;

    GeneralProcess(){
        this.setID(count);
        count++;
    }
    public int getStorage() {
        storage = (int) (Math.random()*( maxValue - minValue ))+minValue+1;
        return storage;
    }
    public int getID() {
        return id;
    }

    public void setID(int id){
            this.id = id;

    }

}
