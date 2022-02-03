package Composite;
/**
 * Represent a hierarchy of objects,
 * and treat them in the same way
 * example:files and folders
 */
public class Main {
    public static void main(String[] args) {

        Shape square1 = new Shape();
        Shape square2 = new Shape();
        Shape circle1 = new Shape();
        Shape circle2 = new Shape();

        Group group1 = new Group();
        group1.addComponent(square1);
        group1.addComponent(square2);

        Group group2 = new Group();
        group2.addComponent(circle1);
        group2.addComponent(circle2);

        Group group = new Group();
        group.addComponent(group1);
        group.addComponent(group2);

        group.render();
        group.move();


    }
}
