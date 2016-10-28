import dia281016.*;

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
		System.out.println("3-Jogo do adivinha");
		System.out.println("0-Sair");
		
		Scanner reader = new Scanner(System.in);
		int op=reader.nextInt();
		
		if(op==1){
			new CalculadoraSimples(); 
		}else if(op ==2){
			new BalacoGAA();
		}else if(op ==3){
			new AdivinhaNumero();
		}else if(op==0){
			System.out.println("Adeus!!");
		}
	
	}
	


}
