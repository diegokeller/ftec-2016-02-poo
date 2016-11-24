package relatorio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import modelo.PerguntaComResposta;
import modelo.RelatorioDTO;

public class CalcularEstatisticas {

	public static List<RelatorioDTO> calcular(
			List<PerguntaComResposta> dados) {

		// Cria a lista
		List<RelatorioDTO> dadosRelatorio = new LinkedList<>();

		// Percorrer as perguntas e repostas
		for (PerguntaComResposta pergunta : dados) {

			// Tenta encontrar a pergunta dentro do relatório
			RelatorioDTO perguntaDoRelatorio = null;
			for (RelatorioDTO itemRelatorio : dadosRelatorio) {
				if (itemRelatorio.getPergunta()
						.equals(pergunta.getPergunta())) {
					perguntaDoRelatorio = itemRelatorio;
					System.out.println("Achou a pergunta.");
					break;
				}
			}
			if (perguntaDoRelatorio == null) {
				System.out
						.println("Não achou a pergunta, vai criar.");
				perguntaDoRelatorio = new RelatorioDTO(
						pergunta.getPergunta(), new HashMap<>());
				dadosRelatorio.add(perguntaDoRelatorio);
			}

			// Agora que tenho a pergunta
			// vamos encontrar a opção de resposta no mapa
			Double contador = perguntaDoRelatorio.getRespostas()
					.get(pergunta.getResposta());
			if (contador == null) {
				contador = 0d;
			}
			contador++;
			perguntaDoRelatorio.getRespostas()
					.put(pergunta.getResposta(), contador);

		}

		// Retorna
		return dadosRelatorio;

	}

}
