package AreaKalkulator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название фигуры");
		String figure = scanner.nextLine();

		if (figure.equals("Triangle")) {
			Figure triangle = new Triangle();
			triangle.area();

		}
		if (figure.equals("Square")) {
			Figure square = new Square();
			square.area();

		}
		if (figure.equals("Circle")) {
			Figure circle = new Circle();
			circle.area();
		}
	}
}
