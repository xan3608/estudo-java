
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(6776, 4566564);
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Numero: " + conta.getNumero());
		System.out.println(Conta.getTotal());
	}
}
