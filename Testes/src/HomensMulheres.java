	import java.util.Locale;
	import java.util.Scanner; 
public class HomensMulheres {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			int qM=0, sexo, qH=0;
			double altura, soma=0, medH=0;
			double max =0, min =10;
			
			for (int i=0; i<3; i++) {
			System.out.printf("Digite 1 para Mulher e 2 para Homem: %n");
			sexo = sc.nextInt();
			System.out.printf("Digite a altura: %n");
			altura = sc.nextDouble();
			if (sexo ==1) {
				qM ++;
			} else if (sexo == 2) {
				qH ++;
				soma = soma + altura;
			} else {
				System.out.println("Digite uma op��o valida!");
			}
			
			if (altura > max) {
				max = altura;
			} else if (altura < min) {
				min = altura;
				}			
			}	
			medH = soma / qH;
			System.out.printf("A maior altura do grupo � de: %.1f, e a menor � de: %.1f%n" ,max, min);
			System.out.printf("A media de altura dos homens �: %.1f%n" ,medH);
			System.out.println("O numero de mulheres �: " +qM);
		sc.close();
		}
}
