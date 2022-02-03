package Structural.Adapter;

import Structural.Adapter.avaFilter.Caramel;

public class CaramelAdapter extends Caramel implements Filter {


    @Override
    public void apply(Image image) {
        init();
        render(image);

    }
}
