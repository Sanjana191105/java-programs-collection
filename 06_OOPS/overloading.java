package JAVA;

import java.util.Scanner;

public class overloading {
	void area(int side) {
		System.out.println("Area of square: "+side*side);
	}
	void area(int length,int width) {
		System.out.println("Area of rectangle: "+length*width);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		int length = sc.nextInt();
		int width = sc.nextInt();
		overloading shape = new overloading();
		shape.area(side);
		shape.area(length,width);

	}

}
