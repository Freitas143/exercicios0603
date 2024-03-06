package exercicios_0603;
import java.util.Scanner;


public class Conversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp;	
		System.out.println("Insira a temperatura em Fahrenheit: ");
		temp = sc.nextFloat();
		final double celsius = ((temp - 32)*5)/9;
		System.out.println("Temperatura em celsius: "+celsius);
		
		sc.close();

	}

}
