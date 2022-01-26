package topic_0_java_basics;

public class SystemProcess extends GeneralProcess{
    int minValue = 5;//5
    int maxValue = 7;//15

    @Override
    public int getStorage() {
        storage = (int) (Math.random()*( maxValue - minValue ))+minValue+1;
        return storage;
    }

}
