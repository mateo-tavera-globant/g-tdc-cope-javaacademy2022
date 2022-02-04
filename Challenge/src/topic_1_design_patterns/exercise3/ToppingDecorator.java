package topic_1_design_patterns.exercise3;

import java.util.ArrayList;
import java.util.List;

abstract class ToppingDecorator implements HotDog{

    protected HotDog tempHotDog;
    protected static List<String> toppings = new ArrayList<>();
    public ToppingDecorator(HotDog newHotDog) {
        tempHotDog = newHotDog;
    }

    @Override
    public String getIngredients() {
        return tempHotDog.getIngredients();
    }
}
