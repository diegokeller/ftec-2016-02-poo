package colecoes_filas_pilhas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainExemploFilaPilha {
	
	public static void main(String[] args) {
		
		// Fila FIFO
		// Primeiro que entra é o primeiro que sai
		Queue<String> listaDeEspera = new LinkedList<String>();
		listaDeEspera.add("João");
		listaDeEspera.add("Maria");
		
		// Pega o primeiro da fila e remove da lista
		String proximoDaFila = listaDeEspera.poll();
		System.out.println(proximoDaFila);
		
		// Consulta o próximo da fila sem remover
		listaDeEspera.add("Carolina");
		System.out.println(listaDeEspera.peek());
		System.out.println(listaDeEspera);
		
		//======================================
		
		// Pilha, Fila no estilo FILO
		// First In Last Out
		// Primeiro que entra, último que sai
		Stack<String> pilha = new Stack<String>();
		pilha.add("João");
		pilha.add("Maria");
		pilha.add("Carol");
		
		// Pop - Obtém e remove o último adicionado
		String ultimo = pilha.pop();
		System.out.println(ultimo);
		
		// Peek
		ultimo = pilha.peek();
		System.out.println(ultimo);
		
		System.out.println(pilha);
		
	}

}
