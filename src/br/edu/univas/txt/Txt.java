package br.edu.univas.txt;

public class Txt {
	public void printStart() {
		System.out.println("Gerador de senha\n");

	}
	public void printInformeTamanhoMaximo() {
		System.out.println("Informe o tamanho m�ximo de caracteres para a senha: ");

	}
	
	public void printInformeTamanhoMinimo() {
		System.out.println("Informe o tamanho m�nimo de caracteres para a senha: ");

	}
	
	public void printInformeLetraMinuscula() {
		System.out.println("Informe se a senha ter� letras min�scula: ");
		System.out.println("Digite 1 para sim e 0 para n�o: ");
	}
	
	public void printInformeLetraMaiuscula() {
		System.out.println("Informe se a senha ter� letras mai�sculas: ");
		System.out.println("Digite 1 para sim e 0 para n�o: ");
	}

	public void printInformeNumero() {
		System.out.println("Informe se a senha ter� n�meros: ");
		System.out.println("Digite 1 para sim e 0 para n�o: ");
	}

	public void printInformeCaracteresEspeciais() {
		System.out.println("Informe se a senha ter� caracteres especiais: ");
		System.out.println("Digite 1 para sim e 0 para n�o: ");
	}

	public void informSaveLocal() {

		System.out.println("Informe o diret�rio onde deseja salvar sua senha:");

	}

	public void printSuccessMessage() {
		System.out.println("Sua senha foi salva com sucesso!!!!");

	}

}
