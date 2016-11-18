package persistencia;

import java.io.IOException;
import java.util.List;

import modelo.Questionario;

public interface Persistencia {
	
	public void salvarQuestionario(Questionario questionario);
	
	public void excluirQuestionario(Integer codigo);
	
	public List<Questionario> buscarTodosQuestionarios() throws IOException;
	
	public Questionario buscarQuestionarioPorCodigo(Integer codigo);

}
