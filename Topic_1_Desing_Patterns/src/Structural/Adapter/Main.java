package Structural.Adapter;

import Structural.Adapter.avaFilter.Caramel;

/**
 * Convert an interface of an object to a
 * different form
 */
public class Main {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));//Using Composition
        imageView.apply(new CaramelAdapter());//Using Inheritance


    }
}
