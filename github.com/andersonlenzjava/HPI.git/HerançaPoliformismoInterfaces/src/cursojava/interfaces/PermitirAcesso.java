package cursojava.interfaces;

//Esta interface ser� o nosso contrato de autentica��o
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);//Declara��o do m�todo com a entrada de alguns parametros

	public boolean autenticar();
}
