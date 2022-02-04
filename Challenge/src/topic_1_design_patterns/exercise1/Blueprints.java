package topic_1_design_patterns.exercise1;

public class Blueprints implements RobotBuilder{

    private Robot robot;

    Blueprints(){
        this.robot = new Robot();
    }


    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin torso");

    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch arms");

    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller skates legs");

    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
