package lista03;

import java.util.Scanner;

//Aluno: Antonio Acrisio Caxias Sousa   ##Matricula: 519391

//Atividade em desenvolvimento, questões estão sendo upadas a medida que as finalizo.

public class Lista03_Array {

//Funções uteis para o desenvolvimento das questões.

//preenche o vetor com valores aleatórios
	public static void completaVetor(int vet[], int inicio, int fim) {

		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) ((Math.random() * (fim - inicio)) + inicio);
		}

	}

//imprime a saida
	public static void imprimir(int[] vet) {
		System.out.println();
		for (int i = 0; i < vet.length; i++) {
			System.out.print(" [" + i + "] " + vet[i]);
			if (i % 20 == 0 && i != 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static String imprimeVetor(int vet[]) {
		String resultado = "";
		for (int i : vet) {
			resultado += " | " + i;
		}
		return resultado;
	}

	public static int interacaoUsuario() {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um número: ");
		return ler.nextInt();
	}

	public static void respostaQuestao(String questao, String resposta) {
		System.out.println("\nResposta :");
		System.out.println("Funcionalidade: " + questao);
		System.out.println("#### Resposta #### " + resposta + "\n");
	}

	public static int pesquisarPorIndice(int vet[], int indice) {
		return vet[indice];
	}

	// pesquisa se um numero esta no vetor, complemento questao01
	public static int pesquisar(int vet[], int numeroPesquisa) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == numeroPesquisa)
				return i;
		}
		return -100;
	}

	// Separação, complemento questão 3
	public static void separaVet(int vet[], int vet01[], int vet02[]) {

		int indiceNegativo = 0;
		int indicePositivo = 0;

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				vet01[indiceNegativo] = vet[i];
				indiceNegativo++;
			} else {
				vet02[indicePositivo] = vet[i];
				indicePositivo++;
			}
		}
	}

	// Inicio das respostas questões

	public static void questao1(int vet[]) {
		Lista03_Array.completaVetor(vet, 0, 20);
		int resposta = pesquisar(vet, interacaoUsuario());

		if (resposta != -100) {
			respostaQuestao("Questao Q1", "Indice onde se encontra o numero procurado : " + resposta);
		} else {
			System.out.println(resposta);
		}
		imprimir(vet);
	}

	public static void questao2(int vet[]) {
		Lista03_Array.completaVetor(vet, -30, 100);
		int indice = interacaoUsuario();
		int resposta = pesquisarPorIndice(vet, indice);

		respostaQuestao("Pesquisa - Q2", " | indice = " + indice + " | elemento = " + resposta);
		imprimir(vet);
	}

	public static void questao3(int vet[]) {
		Lista03_Array.completaVetor(vet, -10, 20);
		int vet01[] = new int[vet.length];
		int vet02[] = new int[vet.length];

		Lista03_Array.separaVet(vet, vet01, vet02);

		int[] vetor3 = new int[vet01.length + vet02.length];
		System.arraycopy(vet01, 0, vetor3, 0, vet02.length);
		System.arraycopy(vet02, 0, vetor3, vet01.length, vet02.length);

		respostaQuestao("Separação - Q3 ", "Elementos Positivo = " + imprimeVetor(vet02));
		respostaQuestao("Separação - Q3 ", "Elementos Negativo = " + imprimeVetor(vet01));
		respostaQuestao("Separação - Q3 ", "Elementos = " + imprimeVetor(vetor3));

	}

	public static void questao4(int vet01[]) {

		Lista03_Array.completaVetor(vet01, 10, 20);

		int soma = 0;

		for (int i = 0; i < vet01.length; i++) {
			soma += vet01[i];
		}

		System.out.println("Elementos do Vetor : " + imprimeVetor(vet01));
		System.out.println("Soma dos Elementos :" + soma);
	}

	public static void questao5(int vet01[], int vet02[], int vetAux[]) {
		Lista03_Array.completaVetor(vet01, 1, 9);
		Lista03_Array.completaVetor(vet02, 10, 20);

		vetAux = new int[vet01.length + vet02.length];

		for (int i = 0; i < vet01.length; i++) {
			vetAux[i] = vet01[i];
		}

		int contador = 0;

		System.out.println("vetor 3 tamanho : " + vetAux.length);
		for (int i = (vetAux.length - vet02.length); i < vetAux.length; i++) {
			vetAux[i] = vet02[contador];
			contador++;
		}

		for (int i = 0; i < vetAux.length; i++) {
			System.out.println(vetAux[i]);

		}
		System.out.println("Vetor 01 :" + imprimeVetor(vet01));
		System.out.println("Vetor 02 :" + imprimeVetor(vet02));
		System.out.println("Vetor Completo :" + imprimeVetor(vetAux));

	}

	public static void questao6(int vet01[], int vetorInvert[]) {
		Lista03_Array.completaVetor(vet01, 1, 9);
		vetorInvert = new int[vet01.length];

		System.out.println(imprimeVetor(vet01));
		System.out.println("Vetor com ordem invertida :");

		for (int i = vet01.length, j = 0; i > 0; i--, j++) {
			vetorInvert[i - 1] = vet01[j];
		}
		System.out.println(imprimeVetor(vetorInvert));
	}

	public static void questao7(int vet01[], int vet02[], int vetAux[]) {
		Lista03_Array.completaVetor(vet01, 1, 9);
		Lista03_Array.completaVetor(vet02, 1, 9);

		System.out.println("Vetor01 :" + imprimeVetor(vet01));
		System.out.println("Vetor02 :" + imprimeVetor(vet02));

		vetAux = vet01;
		vet01 = vet02;
		vet02 = vetAux;

		System.out.println("Este agora possui os valores de Vet02 :" + imprimeVetor(vet01));
		System.out.println("Este agora possui os valores de Vet01 :" + imprimeVetor(vet02));

	}

	public static void questao8(int vet01[], int vetAux[]) {
		Lista03_Array.completaVetor(vet01, 1, 9);

		System.out.println(imprimeVetor(vet01));
	}
	
	public static void questao10(int vet01[]) {
		Lista03_Array.completaVetor(vet01, 0, 2);
		System.out.println(imprimeVetor(vet01));
	}
	public static void questao11(int vet01[]) {
		
	}
public static void questao12(int vet01[]) {
		
	}
public static void questao13(int vet01[]) {
	
}
public static void questao14(int vet01[]) {
	
}
public static void questao15(int vet01[]) {
	
}
public static void questao16(int vet01[]) {
	
}
public static void questao17(int vet01[]) {
	
}
public static void questao18(int vet01[]) {
	
}
public static void questao19(int vet01[]) {
	
}

	// ##########################--Classe Principal--######################

	public static void main(String[] args) {

		int vet01[] = new int[10];
		int vet02[] = new int[10];
		int vetAux[] = new int[20];

		System.out.println("#################-Bem vindo a Lista03 de Funções e Arrays 2022.2-#################");
		System.out.println("Selecione a questão 1 - 20 :");
		Scanner ler = new Scanner(System.in);

		int questao = ler.nextInt();

		switch (questao) {
		case 1:
			Lista03_Array.questao1(vet01);
			break;
		case 2:
			Lista03_Array.questao2(vet01);
			break;
		case 3:
			Lista03_Array.questao3(vet01);
			break;
		case 4:
			Lista03_Array.questao4(vet01);
			break;
		case 5:
			Lista03_Array.questao5(vet01, vet02, vetAux);
			break;
		case 6:
			Lista03_Array.questao6(vet01, vet02);
			break;
		case 7:
			Lista03_Array.questao7(vet01, vet02, vetAux);
			break;
		case 8:
			Lista03_Array.questao8(vet01, vetAux);
			break;
		case 10:
			Lista03_Array.questao10(vet01);
			break;
		case 11:
			Lista03_Array.questao11(vet01);
			break;
		case 12:
			Lista03_Array.questao12(vet01);
			break;
		case 13:
			Lista03_Array.questao13(vet01);
			break;
		case 14:
			Lista03_Array.questao14(vet01);
			break;
		case 15:
			Lista03_Array.questao15(vet01);
			break;
		case 16:
			Lista03_Array.questao16(vet01);
			break;
		case 17:
			Lista03_Array.questao17(vet01);
			break;
		case 18:
			Lista03_Array.questao18(vet01);
			break;
		case 19:
			Lista03_Array.questao19(vet01);
			break;
		}

	}

}
