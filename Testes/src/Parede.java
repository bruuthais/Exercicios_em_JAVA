import java.util.Scanner;

public class Parede {
	public static void main(String[] args) {
		double Ap, Lp, Aa=0.35, La=0.3, qtd;
		Scanner sc = new Scanner (System.in);
		System.out.println("Olá, vamos te ajudar a calcular quantos azulejos de 0.35 x 0.3 a sua parede precisa!");
		System.out.println("Insira a altura da parede:");
		Ap= sc.nextDouble();
		System.out.println("Insira a largura da parede:");
		Lp= sc.nextDouble();
		qtd= (Ap * Lp) / (Aa * La);
		System.out.printf("Prontinho! Você irá precisar de: %.0f azulejos", qtd );
		sc.close();
	}
}
