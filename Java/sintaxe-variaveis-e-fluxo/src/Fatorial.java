
public class Fatorial {

	public static void main(String[] args) {
		int aux = 1;
		for (int i = 1; i <= 10; i++) {
			aux *= i;
			System.out.println("O fatorial de " + i + " é igual a " + aux);
		}
	}
}
