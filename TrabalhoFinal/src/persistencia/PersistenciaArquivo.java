package persistencia;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import modelo.Questionario;

public class PersistenciaArquivo implements Persistencia {

	private static final String PASTA = "D:\\Desenvolvimento\\Java\\FTEC\\ftec-2016-02-poo\\TrabalhoFinal\\arquivos\\";
	private DateTimeFormatter formatador = DateTimeFormatter
			.ofPattern("d/M/u k:m:s");;

	@Override
	public void salvarQuestionario(Questionario questionario)
			throws IOException {

		// Verifica se o arquivo não existe e cria
		Path caminho = Paths.get(PASTA + "questionarios.txt");
		if (!Files.exists(caminho)) {
			Files.createFile(caminho);
		}

		// Busca todos
		List<Questionario> questionarios = buscarTodosQuestionarios();

		// Pega o último código gerado e incrementa
		Questionario ultimo = questionarios
				.get(questionarios.size() - 1);
		Integer codigo = ultimo.getCodigo() + 1;
		questionario.setCodigo(codigo);
		
		// Adiciona na lista
		questionarios.add(questionario);

		// Salva os questionários no arquivo
		try (BufferedWriter writer = Files.newBufferedWriter(
				caminho, Charset.forName("UTF-8"),
				StandardOpenOption.TRUNCATE_EXISTING)) {
			for (Questionario q : questionarios) {
				writer.write(q.getCodigo().toString());
				writer.write(";");
				writer.write(q.getNome());
				writer.write(";");
				writer
						.write(q.getDataDeCriacao().format(formatador));
				writer.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

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
			Integer codigo) throws IOException {
		// Busca todos
		List<Questionario> questionarios = buscarTodosQuestionarios();

		// Pesquisa pelo código
		for (Questionario questionario : questionarios) {
			if (questionario.getCodigo().equals(codigo)) {
				return questionario;
			}
		}

		return null;
	}

}
