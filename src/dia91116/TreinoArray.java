package dia91116;

public class TreinoArray {

	public TreinoArray() {
		
		// Jogo Porto vs Benfica - Resultado
		
		/*
		 * Tipo de variavel;[] array; nome de variavel; inicializa��o
		 * tamanho de variavel
		 */
		
		int[] golos = new int [2];
		
		//Atribui��o de vaiaveis ao array
		
		//Posi��o 0-Porto
		golos[0]=1;
		
		//Posi��o 1-Benfica
		golos[1]=1;
		
		//Instancia��o com inicializa��o de variaveis
		int[] portoBenfica ={1,1};
		
		//Sporting vs Arouca
		
		int[] sportingArouca={3,0};
		
		//Braga vs Maritimo
		
		int[] bragaMaritimo={0,1};
		
		/*
		 * ---------Output do Array do Sporting Arouca----------
		
		for(int i = 0;i>=1;i++){
			
			System.out.print(sportingArouca[i]);
			if(i==0){
				System.out.print("-");
			}
			
		}
		*/
		
		/*Array Multidirecional
		*	
		*	[][]
		*	[][]
		*	[][]
		*/
		
		/*Array com os grandes jogos
		 *			   C  L	
		 * grandeJogos[0][0]-1� Posi��o -Porto vs Benfica
		 * grandeJogos[0][1]-2� Posi��o -Sporting vs Arouca
		 * grandeJogos[0][2]-3� Posi��o -Braga vs Maritimo 
		 * 
		 */
		int[][] grandeJogos=new int[2][3];
		
		grandeJogos[0][0]=portoBenfica[0];
		grandeJogos[1][0]=portoBenfica[1];
		grandeJogos[0][1]=sportingArouca[0];
		grandeJogos[1][1]=sportingArouca[1];
		grandeJogos[0][2]=bragaMaritimo[0];
		grandeJogos[1][2]=bragaMaritimo[1];
		
		
		System.out.println(grandeJogos[0]);
		
	}

}
