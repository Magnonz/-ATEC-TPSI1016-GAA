package dia161116;

public class carta {
	//-----Atributos
	public int naipe;
	public String nome;
	public int pontua��o;
	
	
	
	//------------Contrutor
	public carta(int naipe,String nome,int pontua��o) {
		this.nome=nome;
		this.pontua��o=pontua��o;
		this.naipe=naipe;
		
	}
	
	
	
	
	
	//-----------Metodos---------

	
	
	/**
	 * @param naipe the naipe to set
	 */
	public void setNaipe(int naipe) {
		this.naipe = naipe;
	}

	/**
	 * @param nome the nome to set
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNaipe() {
		return naipe;
	}

	public String getNome() {
		return nome;
	}

	public int getPontua��o() {
		return pontua��o;
	}


	public void setPontua��o(int pontua��o) {
		this.pontua��o = pontua��o;
	}


}
