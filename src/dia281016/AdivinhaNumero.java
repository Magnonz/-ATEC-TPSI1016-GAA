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
		int ntentativas=1;
		Scanner reader = new Scanner(System.in);
		System.out.println("Bem vindo ao jogo do adivinha");
		System.out.print("Intruduza um numero:");
		
		int tentativa=reader.nextInt();
		
		while(tentativa!=escondinho && ntentativas<3){
			 if(tentativa<escondinho){
				System.out.print("Errado!!!O seu numero é menor, tente outra vez :");
				
			}else if(tentativa>escondinho){
				
				System.out.print("Errado!!!O seu numero é maior, tente outra vez :");
			}
			
			tentativa=reader.nextInt();
			
			ntentativas++;
			if(ntentativas==3){
				System.out.print("Bolas!!!Voce está sem sorte!!O numero secreto era:"+escondinho+"Boa sorte para a proxima!!!");
			}
			
			
		}
		if(tentativa==escondinho){
			System.out.print("Parabens acertou!!!!!");
			
		}
		
		
		
	}		
		
	

}
