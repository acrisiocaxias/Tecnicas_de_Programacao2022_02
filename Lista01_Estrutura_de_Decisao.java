//#Autor: Antonio Acrisio Caxias Sousa
//#Matricula: 519391
//#Disciplina: Técnicas de Programação

package Estruturas;

import java.util.Scanner;

public class Lista01_Estrutura_de_Decisao {

	public static void main(String[] args) {
		System.out.println("#### Vamos a Questao 01 ####");
		Questao01();
		System.out.println("#### Vamos a Questao 02 ####");
		Questao02();
		System.out.println("#### Vamos a Questao 03 ####");
		Questao03();
		System.out.println("#### Vamos a Questao 04 ####");
		Questao04();
		System.out.println("#### Vamos a Questao 05 ####");
		Questao05();
		System.out.println("#### Vamos a Questao 06 ####");
		Questao06();
		System.out.println("#### Vamos a Questao 07 ####");
		Questao07();
		System.out.println("#### Vamos a Questao 08 ####");
		Questao08();
		System.out.println("#### Vamos a Questao 09 ####");
		Questao09();
		System.out.println("#### Vamos a Questao 10 ####");
		Questao10();
		System.out.println("#### Vamos a Questao 11 ####");
		Questao11();
		System.out.println("#### Vamos a Questao 12 ####");
		Questao12();
		System.out.println("#### Vamos a Questao 13 ####");
		Questao13();

		System.out.println("Obrigado por vir ate o final !!!");

	}

//####################################################################
	public static void Questao01() {

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		// 1) VerifiQue se A é maior Que 10, se verdade imprima: "A > 10" e verifiQue
		// se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
		// segunda afirmação não seja verdadeira, imprima: "número não válido".

		// Inicio estrutura
		if (A > 10) {
			System.out.println("A>B");

			if (A + B == 20) {
				System.out.println("A + B == 20");
			} else {
				System.out.println("Numero não valido !!!");
			}
		}
	}

	// ####################################################################
	public static void Questao02() {

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		// 2) VerifiQue se A é menor Que 10, se verdade imprima: "A < 10", e verifiQue
		// se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
		// nenhumas das afirmação não seja verdadeira, imprima: "número não
		// válido", (obs: apenas uma impressão é permitida na saída do programa).

		// Inicio estrutura
		if (A < 10) {
			System.out.println("A < 10");
			if (A + B == 20) {
				System.out.println("A + B == 20");
			}
		} else {
			System.out.println("Numero não válido !!!");
		}

	}

	// ####################################################################
	public static void Questao03() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		// 3) VerifiQue se A é igual a 10, se verdade imprima: "A == 10", e verifiQue
		// se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifiQue
		// se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
		// impressões são permitidas na saída do programa).

//Inicio estrutura		 

		if (A == 10) {
			System.out.println("A == 10");
			if ((A + B) == 20) {
				System.out.println("A + B == 20");
			}
		}
		if (B == 10) {
			System.out.println("B == 10");
		}
	}

	// ####################################################################
	public static void Questao04() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		// 4) VerifiQue se A é maior Que 10 ou se A mais B é igual a 20, se verdade
		// imprima: "número válido". Caso as afirmações não sejam verdadeiras,
		// Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
		// diferentes de 10; A é menor Que 10) caso não seja verdade imprima:
		// "número não válido".

//Inicio estrutura		 

		if (A > 10 || (A + B) == 20) {

			System.out.println("Número Valido !!!");
		} else if (A == B) {
			System.out.println("A é igual B; A e B são\r\n" + "diferentes de 10; A é menor Que 10");
		} else {
			System.out.println("Numero Invalido !!!");
		}
	}

	// ####################################################################
	public static void Questao05() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		// 5) VerifiQue se A é maior Que 10 ou se A mais B é igual a 20, se verdade
		// imprima: "número válido". Caso as afirmações não sejam verdadeiras,
		// imprima: "número não válido".

//Inicio estrutura		 
		if (A > 10 || (A + B) == 20) {
			System.out.println("Números Validos !!!");
		}
		if (A < 10 || (A + B) != 20) {
			System.out.println("Números não validos !!!");
		}
	}

	// ####################################################################
	public static void Questao06() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		// 6) VerifiQue se A é maior Que 10, se verdade imprima: "A > 10" caso não
		// seja, imprima: "A <= 10". VerifiQue se A mais B é igual a 20, se
		// verdadeiro, imprima: "A + B == 20”, caso não seja imprima: “A + B !=
		// 20”.

//Inicio estrutura		 
		if (A > 10) {
			System.out.println("A>10");
		} else {
			System.out.println("A <= 10");
		}
		if (A + B == 20) {
			System.out.println("A + B = 20");
		} else {
			System.out.println("A + B != 20");
		}
	}

	// ####################################################################
	public static void Questao07() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		// 7) VerifiQue se A é maior Que 10 ou se o A mais B é igual a 20, caso sejam
		// verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
		// afirmação não seja verdadeira, imprima: "número não válido".

//Inicio estrutura	

		if (A > 10 || A + B == 20) {
			System.out.println("Numeros Validos !!");
		} else {
			System.out.println("Numeros não validos !!!");
		}

	}

	// ####################################################################
	public static void Questao08() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		// 8) VerifiQue se A é maior Que 10, se verdade imprima: "A > 10" e verifiQue
		// se A mais B é igual a 20, se verdadeiro, imprima: "A + B == 20” se não
		// for verdade: imprima "número não válido ".

//Inicio estrutura		 

		if (A > 10) {

			System.out.println("A > 10");
			if (A + B == 20) {
				System.out.println("A + B == 20");
			}
		} else {
			System.out.println("Numero Invalido");
		}
	}

	// ####################################################################
	public static void Questao09() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		//
		// 9) VerifiQue se A é maior Que 10 e verifiQue se A mais B é igual a 20, se
		// verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
		// verdadeiras imprima: "número não válido".

//Inicio estrutura		 
		if (A > 10 && A + B == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("Numero não valido !!!");
		}
	}

	// ####################################################################
	public static void Questao10() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		//
		// 10)VerifiQue se A é maior Que 10 se não for imprima: "número menor Que
		// 10". VerifiQue se A mais B é igual a 20 se não for verdade imprima
		// "número diferente de 20".

//Inicio estrutura		 
		if (A > 10) {

		} else {
			System.out.println("Número menor Que 10");
		}
		if (A + B == 20) {

		} else {
			System.out.println("Número diferente de 20");
		}
	}

	// ####################################################################
	public static void Questao11() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		//
		// 11)VerifiQue se A é maior Que 10 se não for verifiQue se A mais B é igual a
		// 20, imprima: "A + B == 20''. Caso A não seja maior Que 10 e A mais B
		// for diferente de 20, imprima: "número não válido".

//Inicio estrutura		 
		if (A > 10) {

		} else if (A + B == 20) {
			System.out.println("A+B==20");
		}
		if (A < 10 && A + B != 20) {
			System.out.println("Número não valido !!!");
		}
	}

	// ####################################################################
	public static void Questao12() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		//
		// 12) VerifiQue se A é maior Que 10 imprima: "A > 10" ou verifiQue se A mais
		// B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
		// verdadeiras, imprima: "números não válidos". Sejam as afirmações
		// anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
		// disciplina de Técnicas de Programação”.

//Inicio estrutura	
		if (A > 10) {
			System.out.println("A>10");
		} else if (A + B == 20) {
			System.out.println("A+B==20");
		} else {
			System.out.println("Numeros não validos !!!");
		}

		System.out.println("Sejam bem vindos a disciplina de tecnicas de programação");
	}

	// ####################################################################
	public static void Questao13() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor de A :");
		int A = ler.nextInt();
		System.out.println("Informe o valor de B :");
		int B = ler.nextInt();

		// 13) VerifiQue se A é maior Que 10, se verdade imprima: "A > 10". Ainda,
		// verifiQue se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
		// Caso as afirmações não sejam verdadeiras, imprima: "números não
		// válidos".

//Inicio estrutura		
		if (A > 10) {
			System.out.println("A>10");
			if (A + B == 20) {
				System.out.println("A+B==20");
			}
		} else {
			System.out.println("Números não validos !!!");
		}
	}
}
