package AreaKalkulator;

import java.util.Scanner;

public class Circle implements Figure {

	@Override
	public void area() {

		System.out.println("Введите радиус");
		Scanner scanner = new Scanner(System.in);

		double radius1 = scanner.nextDouble();
		double area1 = Math.PI * (radius1 * radius1);
		System.out.println("Площадь круга равна: " + area1);
	}

}
