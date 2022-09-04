package estrutura_repeticao;

import java.util.Scanner;

public class Questao12_C {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o numero de linhas :");
		int linha = ler.nextInt();
		System.out.print("Informe o numero de colunas :");
		int coluna = ler.nextInt();
		int matriz[][] = new int[linha][coluna];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i % 2 == 0)
					System.out.print(" # ");

				else
					System.out.print(" * ");
			}
			System.out.println();
		}

	}
}
