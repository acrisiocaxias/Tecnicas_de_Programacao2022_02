package lab1;

public class Main {

	public static void main(String[] args) {
		Apresentacao a = new Apresentacao();
		/* Questao 1 */
		 Atendimento atendimento = a.carregarDadosParaTesteAtendimento();
		 System.out.println(atendimento.imprimir());
		
		 Agendamento agendamento = a.carregarDadosParaTesteAgendamento();
		 System.out.println(agendamento.imprimir());

		/* Questao 2 */
		Atendimento atendimento2 = a.dadosCarregadosDoTecladoAtendimento();
		System.out.println(atendimento2.imprimir());

	}

}
