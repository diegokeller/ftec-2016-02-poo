package notificacoes;

public class Email extends Notificacao {

	private String titulo;

	public Email(String titulo, String corpoMensagem,
			String remetente, String destinatario) {
		super(corpoMensagem, remetente, destinatario);
		this.titulo = titulo;
	}

	// SOBRECARGA
	@Override
	public void enviar() {
		System.out.println("Conectando no servidor SMTP");
		System.out.println("Autenticando");
		System.out.println("Enviando mensagem");
		System.out.println("Desconectando");
	}

	public String getTitulo() {
		return titulo;
	}
}
