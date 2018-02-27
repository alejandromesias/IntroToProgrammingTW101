package com.amesiastwu;

public class IsoscelesShaper extends HorizontalTracer{
    @Override
    public void draw(int size) {

        for(int i = 0; i < size; i++){
            int whiteSpacesQty = size - i - 1;
            int asterisksQty = 2*i + 1;
            super.draw(whiteSpacesQty, " ");
            super.draw(asterisksQty, "*");
            System.out.print("\n");
        }

    }
}
