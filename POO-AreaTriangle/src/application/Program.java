package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle X, Y;
		X = new Triangle();
		Y = new Triangle();

		System.out.println("Enter the measure of triangle X: ");
		X.a = sc.nextDouble();
		X.b = sc.nextDouble();
		X.c = sc.nextDouble();
		System.out.println("Enter the measure of triangle Y: ");
		Y.a = sc.nextDouble();
		Y.b = sc.nextDouble();
		Y.c = sc.nextDouble();

		double p = (X.a + X.b + X.c) / 2.0;
		double areaX = Math.sqrt(p * (p - X.a) * (p - X.b) * (p - X.c));

		p = (Y.a + Y.b + Y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - Y.a) * (p - Y.b) * (p - Y.c));

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area X");
		} else {
			System.out.println("Larger area Y");
		}

		sc.close();

	}

}
