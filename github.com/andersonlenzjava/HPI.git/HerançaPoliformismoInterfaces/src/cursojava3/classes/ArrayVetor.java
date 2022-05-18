package cursojava3.classes;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

import cursojava.constantes.Aluno;
import cursojava.constantes.Disciplina;

//Neste exemplo temos, lista de alunos, array (vetor) de notas, 
public class ArrayVetor {

	// Usado para executar o c�digo
	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.9 };
		double[] notas2 = { 5.8, 9.3, 9.6, 6.1 };

		
		// instancia��o do aluno
		Aluno aluno = aluno = new Aluno();
		aluno.setNome("Anderson Miguel Lenz");
		aluno.setNomeEscola("JDEV Treinamentos");

		// instancia��o da disciplina 1
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		// instancia��o da disciplina 1
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Javaweb");
		disciplina2.setNota(notas2);

		aluno.getDisciplinas().add(disciplina2);

		// --------------------------------------

		double[] notas3 = { 8.8, 9.7, 7.6, 6.9 };
		double[] notas4 = { 5.8, 9.3, 9.6, 6.1 };

		Aluno aluno2 = aluno2 = new Aluno();
		aluno2.setNome("jose");
		aluno2.setNomeEscola("JDEV Treinamentos");

		// instancia��o da disciplina 3
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de Java");
		disciplina3.setNota(notas3);

		aluno2.getDisciplinas().add(disciplina3);

		// instancia��o da disciplina 4
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Javaweb");
		disciplina4.setNota(notas4);

		aluno2.getDisciplinas().add(disciplina4);

		// --------------------------------------------

		Aluno[] arrayAlunos = new Aluno[2];

		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;

		for (int pos = 0; pos < arrayAlunos.length; pos++) {

			System.out.println("-------------------------------------------------------------");

			System.out.println("  Nome do aluno � : " + arrayAlunos[pos].getNome());

			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {

				System.out.println(" \n Nome da disciplina � : " + d.getDisciplina());

				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println(" A nota numero : " + posnota + " � igual = " + d.getNota()[posnota]);
				}
			}
		}

	}

}