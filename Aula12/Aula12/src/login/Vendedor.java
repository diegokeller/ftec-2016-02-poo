package login;

public class Vendedor implements PodeFazerLogin {

	@Override
	public boolean login() {
		System.out.println("Vendedor fazendo login.");
		return false;
	}

}
