package dia281016;

import java.util.Scanner;



public class BalacoGAA {
	int totalReceitas,totalDespesas;
	
	public BalacoGAA() {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Intruduza o valor das quotas:");
		int quotas=reader.nextInt();
		System.out.print("Intruduza o valor do Baile :");
		int recBaile=reader.nextInt();
		System.out.print("Intruduza o valor do Bar :");
		int recBar=reader.nextInt();
		
		totalReceitas=quotas+recBaile+recBar;
		System.out.println("O total de receitas � :"+totalReceitas);
		
		System.out.println("Quer calcular as Despesas: ");
		System.out.println("1-Sim ");
		System.out.println("2-N�o");
		
		int op=reader.nextInt();
		
		if(op==1){
			   
			calcularDespesas();
			System.out.println("O valor da despesa �:"+totalDespesas);
			System.out.println("Lucro ser�:"+(totalReceitas-totalDespesas));
			
			 
		}else if(op ==2){
				
			System.out.println("Bye-Bye!!!");				
		}
		
	}
	public void calcularDespesas(){
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Intruduza o valor da agua:");
		int agua=reader.nextInt();
		System.out.print("Intruduza o valor da luz :");
		int luz=reader.nextInt();
		System.out.print("Intruduza o valor do telefone :");
		int telefone=reader.nextInt();
		
		totalDespesas=agua+luz+telefone;
		
		
	}
	
	
}
