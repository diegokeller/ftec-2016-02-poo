package modelo;

import java.util.Map;

public class RelatorioDTO {

	private String pergunta;
	private Map<String, Double> respostas;

	public RelatorioDTO(String pergunta,
			Map<String, Double> respostas) {
		super();
		this.pergunta = pergunta;
		this.respostas = respostas;
	}

	@Override
	public String toString() {
		return "RelatorioDTO [pergunta=" + pergunta
				+ ", respostas=" + respostas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((pergunta == null) ? 0 : pergunta.hashCode());
		result = prime * result
				+ ((respostas == null) ? 0 : respostas.hashCode());
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
		RelatorioDTO other = (RelatorioDTO) obj;
		if (pergunta == null) {
			if (other.pergunta != null)
				return false;
		} else if (!pergunta.equals(other.pergunta))
			return false;
		if (respostas == null) {
			if (other.respostas != null)
				return false;
		} else if (!respostas.equals(other.respostas))
			return false;
		return true;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public Map<String, Double> getRespostas() {
		return respostas;
	}

	public void setRespostas(Map<String, Double> respostas) {
		this.respostas = respostas;
	}

}
