package Behavioral.Strategy;

/**
 * Choose which algorithm use to a certain object
 */
public class Main {
    public static void main(String[] args) {

        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store("picture1",new JpegCompressor(),
                                              new BlackAndWhiteFilter());

        imageStorage.store("picture1",new PngCompressor(),
                new BlackAndWhiteFilter());
    }
}
