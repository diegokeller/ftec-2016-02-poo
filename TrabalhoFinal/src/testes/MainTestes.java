package testes;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import modelo.Questionario;
import persistencia.Persistencia;
import persistencia.PersistenciaArquivo;

public class MainTestes {

	public static void main(String[] args) {

		Persistencia p = new PersistenciaArquivo();

		// Buscar todos
		try {
			List<Questionario> todosQuestionarios = p
					.buscarTodosQuestionarios();
			System.out.println(todosQuestionarios);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Questionario q = p.buscarQuestionarioPorCodigo(1);
			System.out.println(q);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Questionario qNovo = new Questionario(null,
				"TESTE NOVO", LocalDateTime.now());
		try {
			p.salvarQuestionario(qNovo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
