package Creational.Factory;

import java.util.Scanner;

/**
 *Return one of several possible classes that share a
 * common super class
 * Create objects without specifying the exact class of an object
 * that will be crated at runtime
 *
 */
public class Main {
    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner scanner = new Scanner(System.in);
        String enemyShipOption = "";

        System.out.println("What type of ship? (U/R/B)");
        //Validates that something is registered
        if (scanner.hasNextLine()) {
            enemyShipOption = scanner.next();
            theEnemy = shipFactory.makeEnemyShip(enemyShipOption);
        }

        if (theEnemy!=null)
            doStuffEnemy(theEnemy);
        else
            System.out.println("Warning");
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();

    }

}
