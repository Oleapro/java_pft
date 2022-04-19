package com.stqa.pft.sandbox;



public class MyFirstProgram {

	public static void main (String[] args) {
		hello("world");
		hello("Olga");


		Point p1 = new Point(1,1);
		Point p2 = new Point(4,4);
		System.out.println("Distance between points p1 and p2 = " + p1.distance(p2));
		//System.out.println("Distance between points p2 and p1 = " + p2.distance(p1));

		Square s = new Square(5);
		System.out.println("Area of a square with side "+s.l+" = "+ s.areaSq());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Area of a rectangle with sides "+ r.a + " and " + r.b + " = "+ r.areaRct());

		Circle c = new Circle(5);
		System.out.println("Area of the circle with radius "+ c.r+ " = "+c.areaCrc());


	}
	public static void hello(String somebody){
		System.out.println("Hello, " + somebody+"!");
	}




}