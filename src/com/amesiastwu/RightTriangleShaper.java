package com.amesiastwu;

public class RightTriangleShaper extends HorizontalTracer{

    @Override
    public void draw(int size) {

        for(int i = 1 ; i <= size ; i++ ){
            super.draw(i);
            System.out.print("\n");
        }
    }
}
