package AreaKalkulator;

import java.util.Scanner;

public class Square implements Figure {

	@Override
	public void area() {
		System.out.println("Введите сторону квадрата: ");
		
		Scanner scanner = new Scanner(System.in);

		double base1 = scanner.nextDouble();

		double area1 = (base1 * base1);
		System.out.println("Площадь квадрата равна: " + area1);
	}
}
