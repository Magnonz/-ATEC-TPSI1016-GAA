package dia161116;

public class carta {
	//-----Atributos
	public int naipe;
	public String nome;
	public int pontuação;
	
	
	
	//------------Contrutor
	public carta(int naipe,String nome,int pontuação) {
		this.nome=nome;
		this.pontuação=pontuação;
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

	public int getPontuação() {
		return pontuação;
	}


	public void setPontuação(int pontuação) {
		this.pontuação = pontuação;
	}


}
