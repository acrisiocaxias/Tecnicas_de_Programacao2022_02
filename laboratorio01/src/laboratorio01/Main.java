package laboratorio01;
import java.util.Calendar;
//Conforme aprendido em sala, irei criar uma classe apresentacao e transferir essas instancias pra la, criando novos metodos para imprimir/anexar etc...
//Permitindo somente as chamadas aqui na Main. (Assim que finalizar as alterações faço o upload).
public class Main {

	public static void main(String[] args) {
		//1°Cliente
		Cliente cliente01 = new Cliente();
		cliente01.setNome("Maria");
		cliente01.setId(0);
		cliente01.setCpf("081.928.929-00");
		
		//2°Cliente
		Cliente cliente02 = new Cliente();
		cliente02.setNome("João");
		cliente02.setId(1);
		cliente02.setCpf("033.098.076-99");
		
		//3°Cliente
		Cliente cliente03 = new Cliente();
	    cliente03.setNome("Antonio");
		cliente03.setId(2);
		cliente03.setCpf("097.876.502-33");
//-------------------------------------------------------		
		
		Agendamento agendamento01 = new Agendamento();
		Calendar data = Calendar. getInstance();
		//1°Agendamento
		agendamento01.setId(cliente01.getId()+2);
		agendamento01.setData("17/02/2014");
		agendamento01.setHora(13);
		agendamento01.setMinuto(13);
		agendamento01.setCliente(cliente01.getNome());
		
		//2°Agendamento
		Agendamento agendamento02 = new Agendamento();
		agendamento02.setId(cliente02.getId()+2);
		agendamento02.setData("13/13/2013");
		agendamento02.setHora(13);
		agendamento02.setMinuto(14);
		agendamento02.setCliente(cliente02.getNome());
		
		//3°Agendamento
		Agendamento agendamento03 = new Agendamento();
		agendamento03.setId(cliente03.getId()+2);
		agendamento03.setData("12/02/2014");
		agendamento03.setHora(33);
		agendamento03.setMinuto(23);
		agendamento03.setCliente(cliente03.getNome());
		
//--------------------------------------------------------		
		
		Atendimento atendimento01 = new Atendimento();
//-------------------------------------------------------
		
		Cabelereiro cabelereiro = new Cabelereiro();
//-------------------------------------------------------
		
		Servico servico = new Servico();
		
//###########Impressão###############		
		
	System.out.println("Informações do Cliente :");
	System.out.println("Nome:"+cliente01.getNome()+"     Id:"+cliente01.getId()+"     Cpf:"+cliente01.getCpf());
	
	System.out.println("Informações do Cliente :");
	System.out.println("Nome:"+cliente02.getNome()+"     Id:"+cliente02.getId()+"     Cpf:"+cliente02.getCpf());
	
	System.out.println("Informações do Cliente :");
	System.out.println("Nome:"+cliente03.getNome()+"     Id:"+cliente03.getId()+"     Cpf:"+cliente03.getCpf());
	
	
	
	System.out.println("#########Informações Agendamentos :#########");
	System.out.println("Id:" + agendamento01.getId() +"      Nome:"+ agendamento01.getCliente() +"  Data:"+ agendamento01.getData());
	System.out.println("Id:" + agendamento02.getId() +"      Nome:"+ agendamento02.getCliente()+"  Data:"+ agendamento02.getData());
	System.out.println("Id:" + agendamento03.getId() +"      Nome:"+ agendamento03.getCliente()+"  Data:"+ agendamento03.getData());
	
	System.out.println("#########Informações Atendimentos :#########");
		
	}

}
