package dia281016;

import java.util.Scanner;

public class CalculadoraSimples {

	public CalculadoraSimples() {
		
		Scanner reader = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Introduza 2 numeros:");
		
		num1=reader.nextInt();
		
		num2=reader.nextInt();
		
		int soma=num1+num2;
		
		System.out.println(soma);
		
		
		
	
	}

}
