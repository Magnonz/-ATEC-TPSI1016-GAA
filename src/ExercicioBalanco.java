
public class ExercicioBalanco {

	int totalReceitas,bolacha;
	
	public ExercicioBalanco() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Hoje tenho sede!!!");
		
		//Calcular Receitas
		calcularReceitas();
		
		
		//Calcular Despesas
		calcularDespesas();
		
		int totaldacena=totalReceitas-bolacha;
		
		System.out.println("Ent�o o seu total de receitas �: "+totalReceitas+"�");
		System.out.println("S�o 5 euros por saber a sua despesa :D");
		System.out.println(totaldacena);
		System.out.println("E s�o mais 5 euros :D");
	}
	
	public void calcularReceitas(){
		
		int quotas = 300, recBaile = 200, recBar =250;
		
		
		
		totalReceitas=quotas+recBaile+recBar;		
		
		
	}
	public void calcularDespesas(){
		
		int agua=100, luz=60, telefone=70;
		
		bolacha=agua+luz+telefone;
		
		
		
		
	}

}
