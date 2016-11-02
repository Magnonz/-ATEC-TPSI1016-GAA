package dia21116;

import java.util.Scanner;

public class Ciclos {

	public Ciclos() {
		
			Scanner reader = new Scanner(System.in);
			System.out.println("Escolha uma Opção: ");
			System.out.println("1-While ");
			System.out.println("2-Do While");
			System.out.println("3-For");
			int op_cicles=reader.nextInt();
		
			switch(op_cicles){
				case 1 : enquanto();break; 
				case 2 : fazerEnquanto();break;	
				case 3 : de_para();break;
				case 0 : System.out.println("Adeus!!");break;
				default: System.out.println("Valor invalido");break;
				
			}
	
		fazerEnquanto();	
		
		
	}

	public void enquanto(){
		
		int i= 0;
		
		String msg = "All you need is dollar";
		
		while(i < 4){
			
			System.out.println(msg);
			i++;
		}
	}
	public void fazerEnquanto(){
		int i= 0;		
		String msg = "All you need is dollar";
		
		do {
			
		System.out.println(msg);
		i++;
		
		}while(i < 4);
	}
	public void de_para(){
			//!!!
		String msg = "All you need is dollar";
		
		for(int i=0; i<=4; i++)
			System.out.println(msg);
		
	}
}
