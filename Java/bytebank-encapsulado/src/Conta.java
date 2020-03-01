public class Conta{
	
	private int agencia, numero;
	private double saldo;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou construindo uma conta");
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;			
	}
	public boolean transfere(double valor, Conta destino) {
		if (saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("O numero n�o pode ser menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("A agencia n�o pode ser menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}