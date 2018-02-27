package com.amesiastwu;

public class DiamondShaper extends HorizontalTracer {

    public void draw(int size){
        draw(size,"");
    }


    public void draw(int size, String name){
        for(int i = 0; i < size; i++){
            int whiteSpacesQty = size - i - 1;
            int asterisksQty = 2*i + 1;

            if (!name.isEmpty() && i == size - 1){
                System.out.println(name);
                break;
            }

            super.draw(whiteSpacesQty, " ");
            super.draw(asterisksQty, "*");
            System.out.print("\n");
        }

        for(int i = size - 2; i >= 0; i--){
            int whiteSpacesQty = size - i - 1;
            int asterisksQty = 2*i + 1;
            super.draw(whiteSpacesQty, " ");
            super.draw(asterisksQty, "*");
            System.out.print("\n");
        }
    }
}
