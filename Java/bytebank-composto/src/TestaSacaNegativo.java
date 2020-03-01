
public class TestaSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.titular = new Cliente();
		conta.titular.nome = "Marcela";
		conta.deposita(200);
		System.out.println(conta.getSaldo());
	}
}
