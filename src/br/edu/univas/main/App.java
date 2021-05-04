package br.edu.univas.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.edu.univas.txt.Txt;
import br.edu.univas.vo.codigo;

public class App {
	private static Scanner sc = new Scanner(System.in);
	private static Txt txt = new Txt();

	public static void main(String[] args) throws IOException {

		codigo cod = new codigo();

		String pass = "";
		String valida = "^";
		String password = "";
		boolean isTrue = false;

		int choice = 0;

		txt.printStart();

		txt.printInformeTamanhoMinimo();
		int tamanhoMin = readInt();

		txt.printInformeTamanhoMaximo();
		int tamanhoMax = readInt();

		txt.printInformeLetraMaiuscula();
		choice = readInt();

		if (choice == 1) {
			pass = cod.getCaractMaiuculos();
			valida = valida + "(?=.*[A-Z])";
		}

		txt.printInformeLetraMinuscula();
		choice = readInt();

		if (choice == 1) {
			pass = pass + cod.getCaractMinusculos();
			valida = valida + "(?=.*[a-z])";
		}

		txt.printInformeNumero();
		choice = readInt();

		if (choice == 1) {
			pass = pass + cod.getNumeros();
			valida = valida + "(?=.*\\d)";
		}

		txt.printInformeCaracteresEspeciais();
		choice = readInt();

		if (choice == 1) {
			pass = pass + cod.getCaractEspeciais();
			valida = valida + "(?=.*[@#$%&*+^><])";
		}

		valida = valida + ".{" + tamanhoMin + "," + tamanhoMax + "}$";

		do {

			password = createPassword(pass, tamanhoMin, tamanhoMax);
			isTrue = isValidPassword(password, valida);

		} while (isTrue == false);

		savePassword(password);

	}

	public static String createPassword(String pass, int tamanhoMin, int tamanhoMax) {
		char[] ch = new char[pass.length()];
		for (int i = 0; i < pass.length(); i++) {
			ch[i] = pass.charAt(i);

		}

		StringBuilder builder = new StringBuilder();
		Random random = new Random();

		int idx = random.nextInt((tamanhoMax - tamanhoMin) + 1) + tamanhoMin;

		for (int i = 0; i < idx; i++) {
			int posicao = (int) (Math.random() * ch.length);
			builder.append(ch[posicao]);

		}

		String password = builder.toString();
		return password;

	}

	public static int readInt() {
		int value = sc.nextInt();
		sc.nextLine();

		return value;
	}

	public static boolean isValidPassword(String password, String validate) {
		Pattern pattern = Pattern.compile(validate);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public static void savePassword(String password) throws IOException {
		txt.informSaveLocal();

		String saveLocal = sc.nextLine();

		File arquivo = new File(saveLocal, "secret_password.txt");
		BufferedWriter bf = new BufferedWriter(new FileWriter(arquivo));
		bf.write(password);
		bf.flush();
		bf.close();

		txt.printSuccessMessage();

	}

}
