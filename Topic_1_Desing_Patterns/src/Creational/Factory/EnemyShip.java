package Creational.Factory;

public abstract class EnemyShip {

    private String name;
    private float amtDamage;

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on te screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does "+getAmtDamage());
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
         name = newName;
    }

    public float getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(float newDamage) {
          amtDamage = newDamage;
    }
}
