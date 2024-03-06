package exercicios_0603;

import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor do litro da gasolina: ");
		float valor_litro = sc.nextFloat();
		System.out.println("Distancia total percorrida(KM): ");
		float distancia = sc.nextFloat();
		System.out.println("Consumo médio(KM): ");
		float consumo_medio = sc.nextFloat();
		final float litros_gastos = distancia / consumo_medio;
		float custo_total = litros_gastos * valor_litro;
		
		System.out.println("Quantidade total de litros gastos: "+litros_gastos);
		System.out.println("Custo total com o combustivel: "+custo_total);
		

		sc.close();
		

	}

}
