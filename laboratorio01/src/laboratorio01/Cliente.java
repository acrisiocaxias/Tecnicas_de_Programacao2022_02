package laboratorio01;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	
	public void setId(int id) {
		if(id>0)
	    	this.id=id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return this.nome;
	}


	public int getId() {
		return this.id;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCpf() {
		return this.cpf;
	}


	
	
}
