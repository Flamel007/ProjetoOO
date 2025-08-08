
public class ClassePessoas {
	String nomeAT;
	String documentoAT;
	float rendaAT;
	
	
	
	public ClassePessoas() {
		
	}
	
	public ClassePessoas(String nomePar, String documentoPar, float rendaPar) {
		this.nomeAT = nomePar;
		this.documentoAT = documentoPar;
		this.rendaAT = rendaPar;
	}
	
	//Setters
	
	public void altereNome(String nomePar) {
		this.nomeAT = nomePar;
	}
	
	public void altereDocumento(String documentoPar) {
		this.documentoAT = documentoPar;
	}
	
	public void altereRenda(float rendaPar) {
		this.rendaAT = rendaPar;
	}
}
