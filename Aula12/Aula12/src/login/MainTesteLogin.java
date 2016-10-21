package login;

public class MainTesteLogin {

	public static void main(String[] args) {
		Representante r = new Representante();
		Loja l = new Loja();
		Vendedor v = new Vendedor();
		Cliente c = new Cliente();
		// Podemos testar se um objeto tem uma capacidade
		// usando instanceof
		if (v instanceof PodeFazerLogin) {
			v.login();
		}
		if (!(l instanceof PodeFazerLogin)) {
			System.out.println("Não pode fazer login");
		}
	}

}
