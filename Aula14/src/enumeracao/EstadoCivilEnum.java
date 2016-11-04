package enumeracao;

public enum EstadoCivilEnum {

	// Listar as opções
	// Primeira em maiúscula
	// Sem espaços, sem acentos
	Solteiro("S", 0), 
	Casado("C", 1), 
	Divorciado("D", 2), 
	Viuvo("V", 3);

	// Atributos da Enum
	private String chave;
	private Integer indice;

	// Construtor
	private EstadoCivilEnum(String chave, Integer indice) {
		this.chave = chave;
		this.indice = indice;
	}

	// Getters e Setters
	public String getChave() {
		return chave;
	}

	public Integer getIndice() {
		return indice;
	}

}
