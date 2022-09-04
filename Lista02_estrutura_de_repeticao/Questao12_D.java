package estrutura_repeticao;

import java.util.Scanner;

public class Questao12_D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o numero de linhas :");
		int linha = ler.nextInt();
		System.out.print("Informe o numero de colunas :");
		int coluna = ler.nextInt();
		int matriz[][] = new int[linha][coluna];

		// int tamanho_matriz=matriz[i].length; //tamanhp da matriz é igual ao nú ero de
		// linhas dela

		for (int i = 0; i < linha; i++) {

			for (int j = 0; j < coluna; j++) {

				// if(i<(i+j)&&j<(j+i))
				// System.out.print(" * ");
				// else
				// System.out.print(" # ");
				if ((j == 0) || (j == (coluna - 1) || (i == 0)) || (i == (linha - 1))) {
					System.out.print(" # ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.print("\n");
		}
		System.out.println();
		ler.close(); // Close in

	}

}
