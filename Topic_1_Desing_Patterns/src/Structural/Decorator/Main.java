package Structural.Decorator;

import Structural.Composite.Stream;

/**
 * Add additional behavior to an object
 */
public class Main {
    public static void main(String[] args) {
        //Output without decorator
        storeCreditCard(new CloudStream());
        //Output with encrypt decorator
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
        //Output with compress decorator
        storeCreditCard(new CompressedCloudStream(new CloudStream()));
        //Output with both decorators
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));

    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234-1234");
    }
}
