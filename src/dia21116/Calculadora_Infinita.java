package dia21116;

import java.util.Scanner;

public class Calculadora_Infinita {

	public Calculadora_Infinita() {
		
		/*
		 * A calculadora deve:
		 * 1-Pedir o primeiro numero
		 * 2-Pedir a operação
		 * 3-Pedir o segundo numero
		 * 4-Apresentar o resultado no ecrã ou sair
		 *   se o segundo numero for igual a 0
		 */
		
		int op =1,total;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("--------Calculadora Infinita-------- ");
		
		
			
		System.out.print("Introduza o primeiro numero: ");
		int num1=reader.nextInt();
		total=num1;
		do{
			System.out.print("Introduza o outro numero: ");
			int num2=reader.nextInt();
			System.out.println("Escolha a operação que deseja fazer: ");
			System.out.println("1-Soma");
			System.out.println("2-Subtração");
			System.out.println("3-Divição");
			System.out.println("4-Multiplicação");
			System.out.println("0-Sair");
			
			op= (new Scanner(System.in)).nextInt();	
			
			switch(op){
			case 1 : System.out.println(total=total+num2);break;//Soma 
			case 2 : System.out.println(total=total-num2);break;//Subtração	
			case 3 : System.out.println(total=total/num2);break;//Divição
			case 4 : System.out.println(total=total*num2);break;//Multiplicação		
			
				}
		
		}while(op!=0);//Fim Condição
		
		
		
			
		
		
		
	
		
		
		
	}//Calculadora_Simples
	

}
