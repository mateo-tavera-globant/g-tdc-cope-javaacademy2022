package tutoria_1;

public class Main_Vehicles {
    public static void main(String[] args) {

    //Create an object for each class
    Standard beetle = new Standard();
    Cabriolet spyder = new Cabriolet();
    OffRoad jeep = new OffRoad();
    Bus doubleDeckBus = new Bus();

    //Execute some methods on each objects
        beetle.driving();
        System.out.println("...");
        beetle.breaking();
        spyder.retractingRoof();
        System.out.println("...");
        spyder.storingRoof();
        jeep.enable4x4();
        jeep.honking();
        System.out.println("...");
        doubleDeckBus.enable4x4();

    }
}
