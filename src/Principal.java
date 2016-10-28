import dia281016.CalculadoraSimples;
import dia281016.BalacoGAA;

import java.util.Scanner;



public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escolha uma Opção: ");
		System.out.println("1-Calculadora Simples ");
		System.out.println("2-Total Receitas");
		Scanner reader = new Scanner(System.in);
		int op=reader.nextInt();
		
		if(op==1){
		
		new CalculadoraSimples(); 
		}else if(op ==2){
			
		new BalacoGAA();
		}else{
			System.out.println("Adeus!!");
		}
	
	}
	


}
