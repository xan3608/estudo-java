
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(5432, 344352);
		conta.setNumero(1472);
		System.out.println(conta.getNumero());
		
		conta.setTitular(new Cliente());
		System.out.println(conta.getTitular());
		conta.getTitular().setNome("Isabela");
		System.out.println(conta.getTitular().getNome());
	}
}
