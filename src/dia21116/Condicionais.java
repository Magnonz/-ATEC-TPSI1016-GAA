package dia21116;

public class Condicionais {

	public Condicionais() {
	
		
		/*
		 *  = -> Atribuição
		 *  == -> Comparação (True || false)
		 *  < -> Comparação
		 *  > -> Comparação
		 *  != -> Comparação
		 *  & -> Concatenador
		 *  && -> Comparação(e então?)
		 *  || -> Comparação (ou que?)
		 *  ! -> Comutador de sinal (verdadeiro para falso)
		 *  () -> Agrupam condições de verdade
		 */
		
		//comparadorSimples();
		comparadorMultiVariavel();
		

	}
	
	public void comparadorSimples(){
		
		int num1 = 3,num2 = 4;
		
		if(num1 == num2)
			System.out.println("Os numeros são iguais");
		else if(num1 < num2)
			System.out.println("O numero 1 é menor que numero 2");
		else
			System.out.println("Os numero 1 é maior que numero 2");
		
		
		
	}
	
	public void comparadorMultiVariavel(){
		int num1=9, num2 =7, num3 =3, num4= 8;
		
		// Se o numero 1 maior que numero 2 e numero 3, mostra que é o maior
		
		if(num1 >num2 && num1>num3 && num1 >num4)
			System.out.println("O numero 1 é maior que numero 2 e o numero 3");
		
		if(!(num2>num3) || num1 >num4)
			System.out.println("Ganha a Equipa 1");
		else
			System.out.println("Ganha a Equipa 2");
		
	}

}
