package com.amesiastwu;

public class Main {

    public static void main(String[] args) {
        System.out.println("Print one Asterisk:");
	    System.out.println("*");

	    HorizontalTracer line = new HorizontalTracer();
	    int length = 10;
        System.out.println("Print a line:");
	    line.draw(length);
	    System.out.print("\n");

        VerticalTracer column = new VerticalTracer();
        int height = 4;
        System.out.println("Print a vertical line:");
        column.draw(height);
    }
}
