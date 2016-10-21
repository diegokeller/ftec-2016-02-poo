package threads;

public class MainTesteThreads {
	
	public static void main(String[] args) {
		
		ContaAte10 conta = new ContaAte10();
		Thread t = new Thread(conta);
		t.start();
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 10; i++){
				System.out.println("Contanto " + i);
			}
		});
		t2.start();
		
	}

}
