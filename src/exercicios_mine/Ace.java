package exercicios_mine;


import java.util.*;
public class Ace {

	Scanner reader = new Scanner(System.in);
	public Ace(){ //2
		
		/*
		 * Pedir ao Utilizador 5 numeros
		 * Esses 5 numeros tem de ir para um array
		 * 2 arrays para impar e par
		 * Verificar se os numeros são par ou impar
		 * Meter os numeros pares na array par e numeros impares na array impar
		 * Mostrar os arrays par e impar
		 *  
		 */
		
		/*
		int[]numeros= new int[5];
		int ipar=0,iimpar=0;
		
		
		
		System.out.println("ACE");
		
		
		for(int inicio = 0; inicio<5; inicio++){
			
			
			System.out.print("Introduza um numero: ");
			numeros[inicio]=reader.nextInt();			
			
		}
		int[] impar=new int[5];
		int[] par=new int[5];
		
		for(int i=0;i< numeros.length;i++){
			
			if(numeros[i]%2==0){
				
				par[ipar]=numeros[i];
				ipar++;
			}else{
				impar[iimpar]=numeros[i];
				iimpar++;
			}	
		
		
		}//2ºfor
		System.out.print("Numeros Pares: ");
		for(int i2=0;i2<ipar;i2++){
		
			System.out.print(par[i2]+" ");
			
		}
		System.out.println("");
		System.out.print("Numeros Impares: ");
		for(int i3=0;i3<iimpar;i3++){
		
			System.out.print(impar[i3]+" ");
			
		}		
		
		*/
		Trey();
	}//ACE
	
		
	public void Duece(){
	//1
		
	/*
	 * Intruduzir o quantos alunos quer meter
	 * Introduzir Meter o nome e idade do aluno
	 * Guardar numa array
	 * Mostrar no fim os nomes e idades 	
	 */
		
		System.out.println("Introduza quantos Alunos quer inserir");
		
		int numAlunos=reader.nextInt();
		
		String[] nomesAlunos= new String[numAlunos];
		int[] idadeAlunos=new int[numAlunos];
		
		for(int i=0;i<numAlunos;i++){
			
			System.out.print("Introduza nome do Aluno:");
			nomesAlunos[i]=reader.next();
			System.out.println();
			System.out.print("Introduza a idade:");
			idadeAlunos[i]=reader.nextInt();
			System.out.println();
			
		}
		
		for(int i2=0;i2<numAlunos;i2++){
			System.out.println((i2+1)+"-"+nomesAlunos[i2]+" "+idadeAlunos[i2]);
		}
		
		
		
		
		
		
	}//Duece
	
	public void Trey(){//3
		
		//Pedir 5 numeros
		//Mostrar crescentemente
		//Mostra a soma dos mesmos
	
		int []numeros=new int[5];
		int []resolve=new int [5];
		int min=0,soma=0;
		
		for(int inicio = 0; inicio<5; inicio++){
			
			
			System.out.print("Introduza um numero: ");
			numeros[inicio]=reader.nextInt();	
			
			if(inicio==0){
				min =numeros[inicio];
			}
			
			
			
		}//1ºfor
		for(int i=0;i<5;i++){	
		
		soma=soma+numeros[i];
		
		resolve=Array.sor
		
			
			
		}
		for(int i2=0;i2<5;i2++){
			System.out.println(resolve[i2]);
			
		}
		
		
		
		
		
	}

}
