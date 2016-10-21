package login;

public class Representante implements PodeFazerLogin {

	@Override
	public boolean login() {
		System.out.println("Representante fazendo login.");
		return false;
	}

}
