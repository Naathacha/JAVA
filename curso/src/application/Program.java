package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Insira os medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2;
		double areaTrianguloX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.b + y.b + y.c) / 2;
		double areaTrianguloY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Area do triangulo X: %.4f%n", areaTrianguloX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaTrianguloY);
		
		if (areaTrianguloX > areaTrianguloY) {
			System.out.println("A maior area é do triangulo X é maior!");
		} else {
			System.out.println("A maior area é do triangulo Y é maior!");
		}
		
		sc.close();
	}

}