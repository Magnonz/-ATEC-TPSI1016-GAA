package dia21116;

public class Condicionais {

	public Condicionais() {
	
		
		/*
		 *  = -> Atribui��o
		 *  == -> Compara��o (True || false)
		 *  < -> Compara��o
		 *  > -> Compara��o
		 *  != -> Compara��o
		 *  & -> Concatenador
		 *  && -> Compara��o(e ent�o?)
		 *  || -> Compara��o (ou que?)
		 *  ! -> Comutador de sinal (verdadeiro para falso)
		 *  () -> Agrupam condi��es de verdade
		 */
		
		//comparadorSimples();
		comparadorMultiVariavel();
		

	}
	
	public void comparadorSimples(){
		
		int num1 = 3,num2 = 4;
		
		if(num1 == num2)
			System.out.println("Os numeros s�o iguais");
		else if(num1 < num2)
			System.out.println("O numero 1 � menor que numero 2");
		else
			System.out.println("Os numero 1 � maior que numero 2");
		
		
		
	}
	
	public void comparadorMultiVariavel(){
		int num1=9, num2 =7, num3 =3, num4= 8;
		
		// Se o numero 1 maior que numero 2 e numero 3, mostra que � o maior
		
		if(num1 >num2 && num1>num3 && num1 >num4)
			System.out.println("O numero 1 � maior que numero 2 e o numero 3");
		
		if(!(num2>num3) || num1 >num4)
			System.out.println("Ganha a Equipa 1");
		else
			System.out.println("Ganha a Equipa 2");
		
	}

}
