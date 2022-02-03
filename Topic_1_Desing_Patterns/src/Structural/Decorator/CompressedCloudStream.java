package Structural.Decorator;

import Structural.Composite.Stream;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }
    private String compress(String data){
        return data.substring(0,5);//Returns 4 characters of the original string
    }

    @Override
    public void write(String data) {
        String compressed = compress(data);
        stream.write(compressed);
    }
}
