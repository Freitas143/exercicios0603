package exercicios_0603;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1,n2;
		
		System.out.println("Informe o primeiro valor: ");
		n1 = sc.nextFloat();
		System.out.println("Informe o segundo valor: ");
		n2 = sc.nextFloat();
		
		final float som = n1+n2;
		final float sub = n1-n2;
		final float mult = n1*n2;
		final float div = n1/n2;
		
		System.out.println(" -----------------------------");
		System.out.println(" Operações entre "+n1+" e "+n2);
		System.out.println(" Soma:  "+som);
		System.out.println(" Subtração:  "+sub);
		System.out.println(" Multiplicação:  "+mult);
		System.out.println(" Divisão: "+div);
		System.out.println(" -----------------------------");
		
		
		
		
		sc.close();

	}

}
