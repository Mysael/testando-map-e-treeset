
public class Rapariga implements Comparable{
	private String nome;
	private String cpf;
	private String especialidade;
	private int idade;
	
	public Rapariga(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public Rapariga(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public void imprimir() {
		// TODO Auto-generated method stub
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Object o) {
		Rapariga r = (Rapariga) o;
		return this.cpf.compareTo(r.cpf);
	}
	

	
}
