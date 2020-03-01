
public class EditorVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando bonificação de Editor de Video");
		return 150.00;
	}
}
