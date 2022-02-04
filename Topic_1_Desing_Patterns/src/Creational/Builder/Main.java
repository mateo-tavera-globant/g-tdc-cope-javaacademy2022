package Creational.Builder;

/**
 * Using Builder
 */
public class Main {
    public static void main(String[] args) {

        RobotBuilder blueprints = new Blueprints();//Specs or blueprint
        RobotEngineer robotEngineer = new RobotEngineer(blueprints);//Engineer needs blueprints

        robotEngineer.makeRobot();
        Robot firstRobot = robotEngineer.getRobot();

        System.out.println(firstRobot.getRobotArms());
        System.out.println(firstRobot.getRobotTorso());
        System.out.println(firstRobot.getRobotLegs());
        System.out.println(firstRobot.getRobotHead());

    }
}

