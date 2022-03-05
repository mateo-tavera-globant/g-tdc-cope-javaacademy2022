/**
 * Creat a simple java program and running
 * whitin a Docker container
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /*
    DOCKER:

    A container is an instance of an image. Docker runs the container
    from an image, which have the OS (only distribution, because kernel is shared
    with the host), the software (Java) and the app (myCode)
    If we want to create a container, we run an image. How?
        docker run *image form docker hub*:*version I want*
        If I don't specify the taf or version, it downloads the latest

        docker pull: downloads the image
        docker run: downloads and runs the image




     */
}
