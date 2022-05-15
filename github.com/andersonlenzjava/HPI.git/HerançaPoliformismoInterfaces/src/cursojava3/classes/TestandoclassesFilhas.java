package cursojava3.classes;

import cursojava.constantes.Aluno;
import cursojava.constantes.Diretor;
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
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
	}

}
