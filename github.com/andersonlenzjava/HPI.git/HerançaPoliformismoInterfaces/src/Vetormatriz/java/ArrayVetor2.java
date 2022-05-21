package Vetormatriz.java;

import javax.swing.JOptionPane;

import cursojava.constantes.Aluno;
import cursojava.constantes.Disciplina;

//Guarda a primeira parte das lógicas //objetos, listas e array

public class ArrayVetor2 {

	// Usado para executar o código
	public static void main(String[] args) {

		double[] notas = { 8.8, 9.7, 7.6, 6.9 };
		double[] notas2 = { 5.8, 9.3, 9.6, 6.1 };

		// instanciação do aluno
		Aluno aluno = aluno = new Aluno();
		aluno.setNome("Anderson Miguel Lenz");
		aluno.setNomeEscola("JDEV Treinamentos");

		// instanciação da disciplina 1
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);

		aluno.getDisciplinas().add(disciplina);

		// instanciação da disciplina 1
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Javaweb");
		disciplina2.setNota(notas2);

		aluno.getDisciplinas().add(disciplina2);

		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso : " + aluno.getNomeEscola());
		System.out.println("--------------Disciplinas do aluno--------------");

		//laço para varer as disciplinas e extrair os seus atributos
		for (Disciplina d : aluno.getDisciplinas()) {

			System.out.println("\n Disciplina : " + d.getDisciplina());
			System.out.println("A notas da discipplina são: ");

			double notaMax = 0.0;

			//laço para imprimir notas das disciplinas
			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + (pos + 1) + " é igual = " + d.getNota()[pos]);
				
				//elemento lógico para estrair a maior nota da lista// e para extrair a menor, inverter 
				// o sinal de comparação, e mudar o texto 
				if (pos == 0) {
					notaMax = d.getNota()[pos];
				} else {
					if (d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			System.out.println("\n A maior nota da Disciplina = " + d.getDisciplina() + " de valor : " + notaMax);
		}

	}

}