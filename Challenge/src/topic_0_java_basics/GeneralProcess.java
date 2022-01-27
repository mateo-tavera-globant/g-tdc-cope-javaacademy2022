/*
Memory Simulator
Mateo Tavera
01/26/2022
 */
package topic_0_java_basics;


public abstract class GeneralProcess {
    private int id;
    int minValue;//Min storage usage
    int maxValue;//Max storage usage
    public static int storage;
    private static int count = 1;

    //Every time an object is created, the ID es set
    GeneralProcess(){
        this.setID(count);
        count++;
    }
    //Generates a random number between a range
    public int getStorage() {
        storage = (int) (Math.random()*( maxValue - minValue ))+minValue+1;
        return storage;
    }
    //ID Getter
    public int getID() {
        return id;
    }

    //ID Setter
    public void setID(int id){
            this.id = id;
    }

}
