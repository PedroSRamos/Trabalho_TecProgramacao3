package br.edu.univas.txt;

public class Txt {
	public void printStart() {
		System.out.println("Gerador de senha\n");

	}
	public void printInformeTamanhoMaximo() {
		System.out.println("Informe o tamanho máximo de caracteres para a senha: ");

	}
	
	public void printInformeTamanhoMinimo() {
		System.out.println("Informe o tamanho mínimo de caracteres para a senha: ");

	}
	
	public void printInformeLetraMinuscula() {
		System.out.println("Informe se a senha terá letras minúscula: ");
		System.out.println("Digite 1 para sim e 0 para não: ");
	}
	
	public void printInformeLetraMaiuscula() {
		System.out.println("Informe se a senha terá letras maiúsculas: ");
		System.out.println("Digite 1 para sim e 0 para não: ");
	}

	public void printInformeNumero() {
		System.out.println("Informe se a senha terá números: ");
		System.out.println("Digite 1 para sim e 0 para não: ");
	}

	public void printInformeCaracteresEspeciais() {
		System.out.println("Informe se a senha terá caracteres especiais: ");
		System.out.println("Digite 1 para sim e 0 para não: ");
	}

	public void informSaveLocal() {

		System.out.println("Informe o diretório onde deseja salvar sua senha:");

	}

	public void printSuccessMessage() {
		System.out.println("Sua senha foi salva com sucesso!!!!");

	}

}
