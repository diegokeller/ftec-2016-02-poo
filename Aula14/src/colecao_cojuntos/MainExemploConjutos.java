package colecao_cojuntos;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainExemploConjutos {
	
	public static void main(String[] args) {
		
		// Conjuntos usam a interface Set
		// Dentro do diamante especificamos o tipo de dados
		// que será salvo no cojunto
		Set<String> conjunto = new LinkedHashSet<String>();
		
		conjunto.add("Maria");
		System.out.println(conjunto);

		conjunto.add("Maria");
		System.out.println(conjunto);

		conjunto.add("João");
		System.out.println(conjunto);
		
		// Percorrer
		for (String string : conjunto) {
			System.out.println(string);
		}
		
	}

}
