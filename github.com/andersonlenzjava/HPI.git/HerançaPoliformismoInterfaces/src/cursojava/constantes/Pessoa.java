package cursojava.constantes;

//heran�a   | clase pai,   classe master ou superclasse. Atributos comuns a todos os objetos filhos 

public abstract class Pessoa {
	
	protected String nome;
	protected Integer idade;
	protected String dataNascimento;
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;
	
	//m�todo abstrato que fica na classe pai, � obrigat�ria para as classes filhas 
	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	//retorna true caso seja maior de 18 anos de idade
	public boolean pessoaMaiorIdade () {
		return idade >= 18;
	}

	public boolean testeVerdade() {
		return idade >= 15;
	}
}
