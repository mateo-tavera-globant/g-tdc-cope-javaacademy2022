package topic_1_design_patterns.exercise3;

public class ExtraSauce extends ToppingDecorator{

    public ExtraSauce(HotDog newHotDog) {
        super(newHotDog);
    }

    @Override
    public String getIngredients() {
        toppings.add("Extra sauce");
        return tempHotDog.getIngredients()+", extra sauce";
    }
}
