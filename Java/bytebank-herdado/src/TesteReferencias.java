
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.00);
		
		Designer d = new Designer();
		d.setSalario(2000.00);
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(g1);
		cb.registra(ev);
		cb.registra(d);
		System.out.println(cb.getSoma());
	}
}
