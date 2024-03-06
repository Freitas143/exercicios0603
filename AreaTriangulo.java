package exercicios_0603;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a base do triangulo: ");
		float base = sc.nextFloat();
		System.out.println("Informe a altura do triangulo: ");
		float altura = sc.nextFloat();
		final float area = (base * altura) / 2;
		System.out.println("Area do triangulo: "+area);
		sc.close();
	}

}
