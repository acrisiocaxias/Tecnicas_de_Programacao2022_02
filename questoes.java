//Aluno : Antonio Acrisio Caxias Sousa
//Matricula : 519391
//Disciplina : Técnicas de Programação


package Estruturas;
import java.util.Scanner;

public class questao01 {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		//1) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
		//se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
		//segunda afirmação não seja verdadeira, imprima: "número não válido".

//Inicio estrutura		 
if(A>10) {
	System.out.println("A>B");
	
	if(A + B==20) {
		System.out.println("A + B == 20");
	}else {
		System.out.println("Numero não valido !!!");
	}
}

	}

}
############################################################################################
public class questao02 {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 

		//2) Verifique se A é menor que 10, se verdade imprima: "A < 10", e verifique
		//se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
		//nenhumas das afirmação não seja verdadeira, imprima: "número não
		//válido", (obs: apenas uma impressão é permitida na saída do programa).
	 
//Inicio estrutura		 
if(A<10) {
	System.out.println("A < 10");
	if(A+B==20) {
	System.out.println("A + B == 20");
	}
}else {
	System.out.println("Numero não válido !!!");
}
	}

}
############################################################################################
public class questao03 {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		//3) Verifique se A é igual a 10, se verdade imprima: "A == 10", e verifique
		//se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifique
		//se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
		//impressões são permitidas na saída do programa).		 
		 
//Inicio estrutura		 
		 
		 if(A==10) {
			 System.out.println("A == 10");
			 if((A+B)==20) {
			 System.out.println("A + B == 20");
			 }
		 }
		 if(B == 10) {
			 System.out.println("B == 10");
		 }
	}
}
############################################################################################
public class questao04 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		//4) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
		//imprima: "número válido". Caso as afirmações não sejam verdadeiras,
		//Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
		//diferentes de 10; A é menor que 10) caso não seja verdade imprima:
		//"número não válido".
		 
//Inicio estrutura		 
		 
	if(A>10||(A+B)==20) {
		
		System.out.println("Número Valido !!!");
	}else if(A==B) {
		System.out.println("A é igual B; A e B são\r\n"
				+ "diferentes de 10; A é menor que 10");
	}else {
		System.out.println("Numero Invalido !!!");
	}
	}

}

############################################################################################
public class questao05 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		//5) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
		//imprima: "número válido". Caso as afirmações não sejam verdadeiras,
		//imprima: "número não válido".

		 
//Inicio estrutura		 
if(A>10||(A+B)==20) {
	System.out.println("Números Validos !!!");
}
if(A<10||(A+B)!=20) {
	System.out.println("Números não validos !!!");
}

	}

}

############################################################################################
public class questao06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		//6) Verifique se A é maior que 10, se verdade imprima: "A > 10" caso não
		//seja, imprima: "A <= 10". Verifique se A mais B é igual a 20, se
		//verdadeiro, imprima: "A + B == 20”, caso não seja imprima: “A + B !=
		//20”.
		 
		 
//Inicio estrutura		 
		if(A>10) {
			System.out.println("A>10");
		}else {
			System.out.println("A <= 10");
		}
		if(A+B == 20) {
			System.out.println("A + B = 20");
		}else {
			System.out.println("A + B != 20");
		}
	}

}

############################################################################################
public class questao07 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		//7) Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
		//verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
		//afirmação não seja verdadeira, imprima: "número não válido".
		 
		 
//Inicio estrutura	
		 
		 if(A>10||A+B==20) {
			 System.out.println("Numeros Validos !!");
		 }else {
			 System.out.println("Numeros não validos !!!");
		 }

	}

}
############################################################################################
public class questao08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		 
		//8) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
		//se A mais B é igual a 20, se verdadeiro, imprima: "A + B == 20” se não
		//for verdade: imprima "número não válido ".

		 
		 
//Inicio estrutura		 
		 
if(A>10) {
	
	System.out.println("A > 10");
	if(A+B==20) {
		System.out.println("A + B == 20");
	}
}else {
	System.out.println("Numero Invalido");
}
	}

}

############################################################################################
public class questao09 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		 //
		//9) Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
		//verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
		//verdadeiras imprima: "número não válido".
		 
		 
//Inicio estrutura		 
		 if(A>10 && A+B==20) {
			 System.out.println("A + B == 20");
		 }else {
			 System.out.println("Numero não valido !!!");
		 }
	}

}
############################################################################################
public class questao10 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		 //
		//10)Verifique se A é maior que 10 se não for imprima: "número menor que
		//10". Verifique se A mais B é igual a 20 se não for verdade imprima
		//"número diferente de 20".
		 
		 
//Inicio estrutura		 
		 if(A>10) {
			 
		 }else {
			 System.out.println("Número menor que 10");
		 }
		 if(A+B==20) {
			 
		 }else {
			 System.out.println("Número diferente de 20");
		 }
	}

}

############################################################################################
public class questao11 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		 //
		//11)Verifique se A é maior que 10 se não for verifique se A mais B é igual a
		//20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
		//for diferente de 20, imprima: "número não válido".
		 
		 
//Inicio estrutura		 
		 if(A>10) {
			 
		 }else if(A+B==20) {
			 System.out.println("A+B==20");
		 }
		 if(A<10&&A+B!=20) {
			 System.out.println("Número não valido !!!");
		 }
	}
}

############################################################################################
public class questao12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		 //
		//12) Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
		//B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
		//verdadeiras, imprima: "números não válidos". Sejam as afirmações
		//anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
		//disciplina de Técnicas de Programação”.
		 
		 
//Inicio estrutura	
		 if(A>10) {
			 System.out.println("A>10");
		 }else if (A+B==20) {
			 System.out.println("A+B==20");
		 }else {
			 System.out.println("Numeros não validos !!!");
		 }
		 
		 System.out.println("Sejam bem vindos a disciplina de tecnicas de programação");
	}

}
############################################################################################
public class questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		 System.out.println("Informe o valor de A :");
		 int A = ler.nextInt();
		 System.out.println("Informe o valor de B :");
		 int B = ler.nextInt();
		 
		//13) Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
		//verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
		//Caso as afirmações não sejam verdadeiras, imprima: "números não
		//válidos".
		 
		 
//Inicio estrutura		
		 if(A>10) {
			 System.out.println("A>10");
			 if(A+B==20) {
				 System.out.println("A+B==20");
			 }
		 }else {
			 System.out.println("Números não validos !!!"); 
		 }
	}

}




