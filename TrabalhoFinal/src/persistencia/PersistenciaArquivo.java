package persistencia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import modelo.Questionario;

public class PersistenciaArquivo implements Persistencia {

	private static final String PASTA = "D:\\Desenvolvimento\\Java\\FTEC\\ftec-2016-02-poo\\TrabalhoFinal\\arquivos\\";

	@Override
	public void salvarQuestionario(
			Questionario questionario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluirQuestionario(Integer codigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Questionario> buscarTodosQuestionarios()
			throws IOException {

		// Cria uma lista
		List<Questionario> questionarios = new LinkedList<>();

		// Verificar se o arquivo existe
		if (!Files
				.exists(Paths.get(PASTA + "questionarios.txt"))) {
			return questionarios;
		}

		// Lê o arquivo de questionarios
		List<String> linhas = Files.readAllLines(
				Paths.get(PASTA + "questionarios.txt"));

		// Percorrer as linhas do arquivo
		for (String linha : linhas) {

			// Quebra os campos
			String[] campos = linha.split(";");

			// Converte os valores
			Integer codigo = Integer.parseInt(campos[0]);
			String nome = campos[1];
			DateTimeFormatter formatador = DateTimeFormatter
					.ofPattern("d/M/u k:m:s");
			LocalDateTime dataDeCriacao = LocalDateTime
					.parse(campos[2], formatador);

			// Cria o questionário
			Questionario q = new Questionario(codigo, nome,
					dataDeCriacao);

			// Adiciona na lista
			questionarios.add(q);
		}
		
		return questionarios;
		
	}

	@Override
	public Questionario buscarQuestionarioPorCodigo(
			Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
