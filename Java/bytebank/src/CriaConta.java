
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		System.out.println("Primeira conta : " + primeiraConta.saldo);
		primeiraConta.saldo += 100.00;
		System.out.println("Primeira conta : " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 500;
		System.out.println("Segunda conta : " + segundaConta.saldo);
		
	}
}
