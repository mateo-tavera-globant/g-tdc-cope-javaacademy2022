package introduction;

public class People {

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    private String name;
    private String gender;

    public People(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
