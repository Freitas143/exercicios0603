package exercicios_0603;
import java.util.Scanner;

public class ConversaoMoeda {
	public static void main(String[]args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Valor em reais(R$): ");
	double vlruser = sc.nextDouble();
	double vlrconvertido = 0;
	System.out.println("Em qual moeda voce deseja converter: ");
	System.out.println("[1] DOLAR ");
	System.out.println("[2] EURO ");
	System.out.println("[3] IENE ");
	int opcao = sc.nextInt();
	
	if(opcao != 0) {
		if (opcao == 1) {
			vlrconvertido = 4.94 * vlruser;
			System.out.println("Valor convertido em Dolares: $ "+vlrconvertido);
		}
		else if (opcao == 2) {
			vlrconvertido = 5.37 * vlruser;
			System.out.println("Valor convertido em Euros: EUR "+vlrconvertido);
		}
		else if (opcao == 3) {
			vlrconvertido = 0.033 * vlruser;
			System.out.println("Valor convertido em Euros: IENE "+vlrconvertido);
		}
	}
	System.out.println("FIM");

	
		
	sc.close();
	}
}
