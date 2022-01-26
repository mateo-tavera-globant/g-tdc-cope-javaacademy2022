package topic_0_java_basics;

public class AppProcess extends GeneralProcess{
    int minValue = 1;//10
    int maxValue = 5;//20

    @Override
    public int getStorage() {
        storage = (int) (Math.random()*( maxValue - minValue ))+minValue+1;
        return storage;
    }


}
