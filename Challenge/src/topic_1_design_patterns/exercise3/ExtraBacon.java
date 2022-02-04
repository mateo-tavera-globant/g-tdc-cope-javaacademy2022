package topic_1_design_patterns.exercise3;
//Decorator
public class ExtraBacon extends ToppingDecorator {

    public ExtraBacon(HotDog newHotDog) {
        super(newHotDog);
    }

    @Override
    public String getIngredients() {
        toppings.add("Extra bacon");
        return tempHotDog.getIngredients()+", extra bacon";
    }
}
