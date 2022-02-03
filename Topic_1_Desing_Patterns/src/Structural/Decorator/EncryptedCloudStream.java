package Structural.Decorator;

import Structural.Composite.Stream;

public class EncryptedCloudStream implements Stream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    private String encrypt(String data){
        return "**************";
    }
    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        stream.write(encrypted);

    }
}
