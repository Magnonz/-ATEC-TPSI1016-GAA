package dia21116;

import java.util.Scanner;

public class Calculadora_Infinita {

	public Calculadora_Infinita() {
		
		/*
		 * A calculadora deve:
		 * 1-Pedir o primeiro numero
		 * 2-Pedir a opera��o
		 * 3-Pedir o segundo numero
		 * 4-Apresentar o resultado no ecr� ou sair
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
			System.out.println("Escolha a opera��o que deseja fazer: ");
			System.out.println("1-Soma");
			System.out.println("2-Subtra��o");
			System.out.println("3-Divi��o");
			System.out.println("4-Multiplica��o");
			System.out.println("0-Sair");
			
			op= (new Scanner(System.in)).nextInt();	
			
			switch(op){
			case 1 : System.out.println(total=total+num2);break;//Soma 
			case 2 : System.out.println(total=total-num2);break;//Subtra��o	
			case 3 : System.out.println(total=total/num2);break;//Divi��o
			case 4 : System.out.println(total=total*num2);break;//Multiplica��o		
			
				}
		
		}while(op!=0);//Fim Condi��o
		
		
		
			
		
		
		
	
		
		
		
	}//Calculadora_Simples
	

}
