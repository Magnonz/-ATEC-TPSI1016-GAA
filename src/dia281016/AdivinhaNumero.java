package dia281016;
import java.util.*;

public class AdivinhaNumero {

	int escondinho;
	final int VALORMAX=5;
	
	public AdivinhaNumero() {
		
		Random r = new Random();
		
		escondinho = r.nextInt(VALORMAX);
		
		tentarAdivinhar();
	}
	
	public void tentarAdivinhar() {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Bem vindo ao jogo do adivinha");
		System.out.print("Intruduza um numero:");
		
		int tentativa=reader.nextInt();
		
		while(tentativa!=escondinho){
			
			System.out.print("Numero errado tente outra vez:");
			tentativa=reader.nextInt();
		}
			System.out.print("Parabens acertou!!!!!");
		
		
		
	}		
		
	

}
