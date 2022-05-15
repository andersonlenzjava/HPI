package cursojava3.classes;

import cursojava.constantes.Aluno;
import cursojava.constantes.Diretor;
import cursojava.constantes.Secretario;

public class TestandoclassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Anderson");
		aluno.setNomeEscola("Java - curso");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Jorge");
		diretor.setRegistroGeral("123123123");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNome("Bruno");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}

}
