package dia21116;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	public Blackjack() {
		System.out.println("Bemvindo ao Blackjack");
		Random r = new Random();
		int carta1 = r.nextInt(13)+1;
		int carta2 = r.nextInt(13)+1;
		int totaljogador=0;
		
		System.out.println("1º Carta = "+ carta1);
		System.out.println("2º Carta = "+ carta2);	
		
		if((carta1==1||carta1>=11) && (carta2==1 || carta2>=11)){
			System.out.println("Blackjack");
			totaljogador=21;
			
		}else{			
			
			if(carta1==1 && carta2<=10)	
				totaljogador=1;
			else if(carta1>=11)
				totaljogador=10;
			else
			totaljogador=carta1;
			
			if(carta2==1 && carta1<=10)
				totaljogador++;			
			else if(carta2>=11)
				totaljogador=+totaljogador+10;
			else			
				totaljogador=totaljogador+carta2;
			
			while(totaljogador<21){
				System.out.println("Quer outra Carta?");
				System.out.println("1-Sim");
				System.out.println("2-Não");
				int op=(new Scanner(System.in)).nextInt();
				
				if(op==1){
					totaljogador=totaljogador+r.nextInt(10)+1;
					System.out.println(totaljogador);
					
					
				}else if(op==2){
					
					break;
				}
				if(totaljogador==21){
					System.out.println("Voce tem Blackjack");
				}else if(totaljogador>21){
					System.out.println("Voce Arrebentou!!");
				}
				
			}//While 						
		
		
	
		}//1º if
		
	}

}
