
public class Testabanco {

	public static void main(String[] args) {
		Cliente alexandre = new Cliente();
		alexandre.nome = "Alexandre";
		alexandre.cpf = "142.536.789-62";
		alexandre.profissao = "Estagiario";
		
		Conta contaAlexandre = new Conta();
		contaAlexandre.deposita(1500.00);
		contaAlexandre.titular = alexandre;
		
		System.out.println(contaAlexandre.titular.nome);
		System.out.println("Saldo: " + contaAlexandre.getSaldo());
		
		Conta conta2 = new Conta();
		conta2.titular = new Cliente();
		conta2.titular.nome = "Jenifer";
	}
}
