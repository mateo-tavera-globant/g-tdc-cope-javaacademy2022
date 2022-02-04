package Creational.AbstractFactory;

/**
 * Allows creating families of related objects without
 * specifying concrete class
 */

public class Main {
    public static void main(String[] args) {

        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt+"\n");


    }
}
