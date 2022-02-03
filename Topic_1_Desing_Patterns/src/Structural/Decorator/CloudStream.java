package Structural.Decorator;

import Structural.Composite.Stream;

//Read or write data to the cloud
public class CloudStream implements Stream {

    @Override
    public void write(String data){
        System.out.println("Storing " + data);
    }
}
