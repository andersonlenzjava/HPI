package cursojava.interfaces;

//Esta interface será o nosso contrato de autenticação
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);//Declaração do método com a entrada de alguns parametros

	public boolean autenticar();
}
