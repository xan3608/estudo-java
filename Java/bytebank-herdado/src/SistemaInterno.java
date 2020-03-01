
public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(FuncionarioAutenticavel fa) {
		if (fa.autentica(senha)) {
			System.out.println("Bem vindo " + fa.getClass().getName().toLowerCase() + ", pode entrar no sistema");
		} else {
			System.out.println("Desculpe, voc� n�o possui permiss�o para entrar no sistema");
		}
	}
}
