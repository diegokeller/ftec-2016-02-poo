package strings;

public class ExemplosString {

	public static void main(String[] args) {

		// Declarando uma string
		String nome = "João da Silva";
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.charAt(2));
		System.out.println(nome.indexOf("S"));
		System.out.println(nome.endsWith("va"));
		System.out.println(nome.equals("joão da silva"));
		System.out.println(nome.equalsIgnoreCase("joão da silva"));
		System.out.println(nome.substring(2, 7));
		String outroNome = nome.replaceAll("da Silva", "de Souza");
		System.out.println(outroNome);

		// Converter String para Integer
		Integer idade = Integer.parseInt("18a");
		System.out.println(idade);

		// Converter String para Float
		Float salario = Float.parseFloat("123.45");
		System.out.println(salario);
	}

}
