package topic_1_design_patterns.exercise3;

public class ExtraChips extends ToppingDecorator{

    public ExtraChips(HotDog newHotDog) {
        super(newHotDog);
    }

    @Override
    public String getIngredients() {
        toppings.add("Extra chips");
        return tempHotDog.getIngredients()+", extra chips";
    }
}
