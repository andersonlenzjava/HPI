package cursojava3.classes;

import cursojava.constantes.Aluno;
import cursojava.constantes.Diretor;
import cursojava.constantes.Pessoa;
import cursojava.constantes.Secretario;

public class TestandoclassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Anderson");
		aluno.setNomeEscola("Java - curso");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setNome("Jorge");
		diretor.setRegistroGeral("123123123");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNome("Bruno");
		secretario.setIdade(18);

		System.out.println(aluno);
//		System.out.println(diretor);
//		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario é = " + aluno.salario());
		System.out.println("Salario é = " + diretor.salario());
		System.out.println("Salario é = " + secretario.salario());
		
		Aluno aluno2 = new Aluno();

		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	// é um método que foi criado para testar 
	public static void teste (Pessoa pessoa) {
		System.out.println("Essa pessoa é top = "
			+ pessoa.getNome() + " e o salário é de = " + pessoa.salario());
	}

}
