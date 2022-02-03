package Behavioral.Command;

public class Button {
    private String label;

    public Button(Command command) {
        this.command = command;
    }

    private Command command;

    public void click(){
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
