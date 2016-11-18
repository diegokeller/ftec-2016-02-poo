package testes;

import java.io.IOException;
import java.util.List;

import modelo.Questionario;
import persistencia.Persistencia;
import persistencia.PersistenciaArquivo;

public class MainTestes {

	public static void main(String[] args) {
		Persistencia p = new PersistenciaArquivo();
		try {
			List<Questionario> todosQuestionarios = p
					.buscarTodosQuestionarios();
			System.out.println(todosQuestionarios);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
