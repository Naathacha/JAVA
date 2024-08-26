package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Insira os medidas do triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Insira as medidas do triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2;
		double areaTrianguloX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2;
		double areaTrianguloY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
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