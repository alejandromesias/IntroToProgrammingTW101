package com.amesiastwu;

public class Main {

    public static void main(String[] args) {
        System.out.println("Print one Asterisk:");
	    System.out.println("*");

	    HorizontalTracer line = new HorizontalTracer();
	    int length = 9;
        System.out.println("Print a line:");
	    line.draw(length);
	    System.out.print("\n");

        VerticalTracer column = new VerticalTracer();
        int height = 4;
        System.out.println("Print a vertical line:");
        column.draw(height);

        RightTriangleShaper rTriangle = new RightTriangleShaper();
        int size = 4;
        System.out.println("Draw a right triangle:");
        rTriangle.draw(size);

        IsoscelesShaper isosceles = new IsoscelesShaper();
        int isoSize = 4;
        System.out.println("Draw an isosceles triangle:");
        isosceles.draw(isoSize);

        DiamondShaper diamond = new DiamondShaper();
        int diaSize = 4;
        System.out.println("Draw a diamond:");
        diamond.draw(diaSize);

        DiamondNamer diamondName = new DiamondNamer();
        int nameSize = 4;
        String name = "Alejo";
        System.out.println("Draw a diamond with name:");
        diamondName.draw(nameSize, name);

        System.out.println("FizzBuzz Exercise:");
        FizzBuzzClass.FizzBuzz();
    }
}
