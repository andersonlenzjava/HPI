package cursojava3.classes;

public class Matriz {

	// executar o código java dos exercicios de matrizes
	public static void main(String[] args) {

		
		// n1 é o numero de linhas
		// n2 é o numero de posições do array

		int notas[][] = new int[2][3];

		notas[0][0] = 90;
		notas[0][1] = 80;
		notas[0][2] = 70;

		notas[1][0] = 40;
		notas[1][1] = 30;
		notas[1][2] = 50;

		for (int poslinha = 0; poslinha < notas.length; poslinha++) {// percore as linhas
			System.out.println("=============================================================");
			// percore as colunas(retorna o tamanho da colunas que a linha notas[N].tamanho tem
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {

				System.out.println("[Linha][coluna] [" + poslinha + "][" + poscoluna + "] Valor da matriz: "
						+ notas[poslinha][poscoluna]);

			}

		}
	}

}
