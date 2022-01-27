package AreaKalkulator;

import java.util.Scanner;

public class Triangle implements Figure {

	@Override
	public void area() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите ширину треугольника: ");
		double base = scanner.nextDouble();

		System.out.println("Введите высоту треугольника: ");
		double height = scanner.nextDouble();
		double area1 = (base * height) / 2;
		System.out.println("Площадь треугольника равна: " + area1);

	}

}
