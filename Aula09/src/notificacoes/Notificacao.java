package notificacoes;

public abstract class Notificacao {

	private String corpoMensagem;
	private String remetente;
	private String destinatario;

	public String getCorpoMensagem() {
		return corpoMensagem;
	}

	public void setCorpoMensagem(String corpoMensagem) {
		this.corpoMensagem = corpoMensagem;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public Notificacao(String corpoMensagem, String remetente,
			String destinatario) {
		super();
		this.corpoMensagem = corpoMensagem;
		this.remetente = remetente;
		this.destinatario = destinatario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corpoMensagem == null) ? 0
				: corpoMensagem.hashCode());
		result = prime * result + ((destinatario == null) ? 0
				: destinatario.hashCode());
		result = prime * result
				+ ((remetente == null) ? 0 : remetente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notificacao other = (Notificacao) obj;
		if (corpoMensagem == null) {
			if (other.corpoMensagem != null)
				return false;
		} else if (!corpoMensagem.equals(other.corpoMensagem))
			return false;
		if (destinatario == null) {
			if (other.destinatario != null)
				return false;
		} else if (!destinatario.equals(other.destinatario))
			return false;
		if (remetente == null) {
			if (other.remetente != null)
				return false;
		} else if (!remetente.equals(other.remetente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Notificacao [corpoMensagem=" + corpoMensagem
				+ ", remetente=" + remetente + ", destinatario="
				+ destinatario + "]";
	}

	public void enviar() {
		System.out.println("Enviando notificação por WS");
	};

}
