/*
Memory Simulator
Mateo Tavera
01/26/2022
 */
package topic_0_java_basics;

public class SystemProcess extends GeneralProcess{
    int minValue = 5;
    int maxValue = 15;

    //Inherits getStorage method but using its own range
    @Override
    public int getStorage() {
        storage = (int) (Math.random()*( maxValue - minValue ))+minValue+1;
        return storage;
    }

}
