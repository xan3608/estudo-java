
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("\tTestando condicionais");
		int idade = 14;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Voc� tem mais ou igual a 18 anos");
			System.out.println("Seja bem vindo");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Voc� n�o tem 18 anos, mas pode entrar pois est� acompanhado");
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar, pois possui menos de 18 anos");
		}
	}
}
