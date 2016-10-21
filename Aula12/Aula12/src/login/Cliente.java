package login;

public class Cliente implements PodeFazerLogin {

	@Override
	public boolean login() {
		System.out.println("Cliente fazendo login.");
		return false;
	}

}
