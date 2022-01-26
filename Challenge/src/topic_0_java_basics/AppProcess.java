/*
Memory Simulator
Mateo Tavera
01/26/2022
 */
package topic_0_java_basics;

public class AppProcess extends GeneralProcess{
    int minValue = 10;//10
    int maxValue = 20;//20

    @Override
    public int getStorage() {
        storage = (int) (Math.random()*( maxValue - minValue ))+minValue+1;
        return storage;
    }


}
