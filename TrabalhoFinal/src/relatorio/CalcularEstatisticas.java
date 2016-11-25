package relatorio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

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

		// Já contei tudo, vamos converter para %
		for (RelatorioDTO itemRelatorio : dadosRelatorio) {

			// Conto o total de todas as respostas
			Double totalRespostas = 0d;
			Set<Entry<String, Double>> entradas = itemRelatorio
					.getRespostas().entrySet();
			for (Entry<String, Double> entrada : entradas) {
				totalRespostas += entrada.getValue();
			}

			System.out.println(itemRelatorio.getPergunta() + " "
					+ totalRespostas);

			// Outra forma de somar, com Java 8
			Double total2 = itemRelatorio.getRespostas().values()
					.stream().mapToDouble(Number::doubleValue).sum();
			System.out.println(total2);

			// Percorre as opções da pergunta e
			// transforma em percentual
			final Double totalFinal = totalRespostas;
			itemRelatorio.getRespostas().entrySet().stream()
					.forEach(entrada -> {
						Double quantidade = entrada.getValue();
						Double percentual = (quantidade / totalFinal);
						entrada.setValue(percentual);
					});
		}

		// Retorna
		return dadosRelatorio;

	}

}
