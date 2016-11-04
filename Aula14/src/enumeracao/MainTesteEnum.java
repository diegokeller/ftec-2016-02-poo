package enumeracao;

public class MainTesteEnum {

	public static void main(String[] args) {

		String estadoCivil = "S"; // Solteiro
		estadoCivil = "C"; // Casado
		estadoCivil = "Abacaxi"; // Opção inválida

		// Declaramos a variável do tipo da enumeração
		EstadoCivilEnum ec = EstadoCivilEnum.Casado;
		ec = EstadoCivilEnum.Solteiro;
		System.out.println(ec.getChave());
		System.out.println(ec.getIndice());
		
		// Converter de String para Enum
		ec = EstadoCivilEnum.valueOf("Casado");
		System.out.println(ec);
		
		// Listar os valores
		EstadoCivilEnum[] valores = EstadoCivilEnum.values();
		for (EstadoCivilEnum valor : valores) {
			System.out.println(valor);
		}

		// Não aceita opções inválidas
		// Não compila
		// ec = EstadoCivilEnum.Complicado;
		// ec = "Pensativo";

	}

}
