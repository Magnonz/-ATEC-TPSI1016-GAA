
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hoje tenho sede!!!");
		
		int quotas = 300, recBaile = 200, recBar =250;
		
		int totalReceitas=quotas+recBaile+recBar;
		
		System.out.println("Ent�o o seu total de receitas �: "+totalReceitas+"�");
		System.out.println("S�o 5 euros por saber a sua despesa :D");
		
		int agua=100, luz=60, telefone=70;
		
		int bolacha=agua+luz+telefone;
		
		int totaldacena=totalReceitas-bolacha;
		
		System.out.println(totaldacena);
		System.out.println("E s�o mais 5 euros :D");
	}

}
