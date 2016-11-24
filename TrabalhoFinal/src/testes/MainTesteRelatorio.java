package testes;

import java.util.LinkedList;
import java.util.List;

import modelo.PerguntaComResposta;
import modelo.RelatorioDTO;
import relatorio.CalcularEstatisticas;

public class MainTesteRelatorio {

	public static void main(String[] args) {

		List<PerguntaComResposta> perguntas = new LinkedList<>();

		perguntas
				.add(new PerguntaComResposta("Sexo?", "Masculino"));
		perguntas
				.add(new PerguntaComResposta("Sexo?", "Masculino"));
		perguntas
				.add(new PerguntaComResposta("Sexo?", "Feminino"));
		perguntas
				.add(new PerguntaComResposta("Sexo?", "Feminino"));

		perguntas.add(new PerguntaComResposta("Estado Civil?",
				"Solteiro"));
		perguntas.add(new PerguntaComResposta("Estado Civil?",
				"Solteiro"));
		perguntas.add(new PerguntaComResposta("Estado Civil?",
				"Solteiro"));
		perguntas.add(
				new PerguntaComResposta("Estado Civil?", "Casado"));
		perguntas.add(
				new PerguntaComResposta("Estado Civil?", "Casado"));
		perguntas.add(
				new PerguntaComResposta("Estado Civil?", "Viúvo"));

		List<RelatorioDTO> relatorio = CalcularEstatisticas
				.calcular(perguntas);
		System.out.println(relatorio);

	}

}
