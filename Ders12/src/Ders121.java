import java.util.Scanner;

public class Ders121 {

	public static int cevre(int a, int b) {
		return 2 * (a + b);
	}

	public static int alan(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		dikdortgenHesabi();

	}

	public static void dikdortgenHesabi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dikd�rtgenin A kenar�n� giriniz:");

		int a = scanner.nextInt();

		System.out.println("Dikd�rtgenin B kenar�n� giriniz :");

		int b = scanner.nextInt();

		int cevre = cevre(a, b);

		int alan = alan(a, b);

		System.out.println("Alan :" + alan + " �evre :" + cevre);
	}

}
