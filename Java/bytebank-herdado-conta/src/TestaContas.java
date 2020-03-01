
public class TestaContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1234, 5678);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(9876, 5432);
		cp.deposita(200.00);
		
		cc.transfere(10, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
