package topic_1_design_patterns.exercise3;

public class ExtraPineapple extends ToppingDecorator{

    public ExtraPineapple(HotDog newHotDog) {
        super(newHotDog);
    }

    @Override
    public String getIngredients() {
        toppings.add("Extra pineapple");
        return tempHotDog.getIngredients()+", extra pineapple";
    }


}
