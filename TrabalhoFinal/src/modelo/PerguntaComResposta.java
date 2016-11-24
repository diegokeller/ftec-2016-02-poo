package modelo;

public class PerguntaComResposta {

	private String pergunta;
	private String resposta;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((pergunta == null) ? 0 : pergunta.hashCode());
		result = prime * result
				+ ((resposta == null) ? 0 : resposta.hashCode());
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
		PerguntaComResposta other = (PerguntaComResposta) obj;
		if (pergunta == null) {
			if (other.pergunta != null)
				return false;
		} else if (!pergunta.equals(other.pergunta))
			return false;
		if (resposta == null) {
			if (other.resposta != null)
				return false;
		} else if (!resposta.equals(other.resposta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PerguntaComResposta [pergunta=" + pergunta
				+ ", resposta=" + resposta + "]";
	}

	public PerguntaComResposta(String pergunta,
			String resposta) {
		super();
		this.pergunta = pergunta;
		this.resposta = resposta;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
