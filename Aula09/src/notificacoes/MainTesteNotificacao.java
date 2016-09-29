package notificacoes;

public class MainTesteNotificacao {

	public static void main(String[] args) {

		SMS sms = new SMS("TESTE SMS", "45678912", "12345678");
		Push push = new Push("TESTE PUSH", "45678912",
				"12345678");
		Email email = new Email("EMAIL1", "TESTE EMAIL",
				"teste@teste.com.br", "teste2@teste.com.br");

		// Declaração de vetores
		// Duas opções
		// Opção 1 - Com tamanho definido
		Notificacao[] notificacoes = new Notificacao[3];
		notificacoes[0] = sms;
		notificacoes[1] = push;
		notificacoes[2] = email;

		// Opção 2 - Já inicializado com os valores
		Notificacao[] notificacoes2 = new Notificacao[] { sms,
				push, email };

		// Envia as notificações
		for (int i = 0; i < notificacoes2.length; i++) {
			notificacoes2[i].enviar();
			System.out.println(notificacoes2[i].getRemetente());

			// Será que é um e-mail
			if (notificacoes2[i] instanceof Email) {
				Email notificacaoEmail = (Email) notificacoes2[i];
				System.out.println(notificacaoEmail.getTitulo());
			}

			// if (leis[i] instanceof LeiOrdinaria) {
			// LeiOrdinaria lo = (LeiOrdinarai) leis[i];
			// lo.publicarNoDiarioOficial();
			// }

		}

		if (notificacoes instanceof Object) {
			System.out.println("é um objeto");
		}

	}

}
