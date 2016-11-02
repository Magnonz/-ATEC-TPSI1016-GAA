package exercicios;
import java.util.Scanner;

import dia21116.*;
import dia281016.CalculadoraSimples;


public class Exercicios {

	public Exercicios() {
		// TODO Auto-generated constructor stub
		System.out.println("-----------Exericicos----------");	
		System.out.println("Escolha uma Opção: ");
		System.out.println("1-Calculadora Infinita ");	
		System.out.println("2-Blackjack ");	
		System.out.println("0-Sair");
		Scanner reader = new Scanner(System.in);
		int op=reader.nextInt();
		
		switch(op){
		case 1 : new Calculadora_Infinita();break; 
		case 2 : new Blackjack();break;
		default: System.out.println("Valor invalido");break;
		}

	}
}
