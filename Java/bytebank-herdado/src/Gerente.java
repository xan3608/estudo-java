
public class Gerente extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando bonificação de Gerente");
		return super.salario;
	}
}
