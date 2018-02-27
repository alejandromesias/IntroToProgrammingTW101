package com.amesiastwu;

public class HorizontalTracer {
    public void draw(int length){
        draw(length, "*");
    }

    public void draw(int length, String character){

        for(int i = 0 ; i < length; i++){
            System.out.print(character);
        }

    }
}
