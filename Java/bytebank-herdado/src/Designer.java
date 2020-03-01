
public class Designer extends Funcionario {

@Override
	public double getBonificacao() {
		System.out.println("Chamando bonificação de Designer");
		return 200.00;
	}
}
