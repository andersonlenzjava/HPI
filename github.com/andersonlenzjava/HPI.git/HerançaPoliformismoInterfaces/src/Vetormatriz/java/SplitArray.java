package Vetormatriz.java;

import java.util.Arrays;
import java.util.List;

//conversão de array para list 

public class SplitArray {

	public static void main(String[] args) {

		String texto = "anderson, curso java, 80, 70, 60, 89";

		String[] valoresArray = texto.split(",");

		System.out.println("nome:" + valoresArray[0]);
		System.out.println("curso:" + valoresArray[1]);
		System.out.println("Nota 1 :" + valoresArray[2]);
		System.out.println("Nota 2 :" + valoresArray[3]);
		System.out.println("Nota 3 :" + valoresArray[4]);
		System.out.println("Nota 4 :" + valoresArray[5]);

		// converter um array em uma lista

		List<String> list = Arrays.asList(valoresArray);

		for (String valorString : list) {
			System.out.println(valorString);

		}

		// converter uma lista para array
		String[] conversaoArray = list.toArray(new String[6]);

		System.out.println(conversaoArray);
		
		for(int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
	}

}
