import java.util.Scanner;

public class MediaSalario {

	 public static void main(String[] args) {
		 	Scanner sc = new Scanner (System.in);
	        double n1, n2, n3, n4, media;
	        
	        System.out.println("Digite o salario da 1 pessoa");
	        n1 = sc.nextDouble();
	        System.out.println("Digite o salario da 2 pessoa");
	        n2 = sc.nextDouble();
	        System.out.println("Digite o salario da 3 pessoa");
	        n3 = sc.nextDouble();
	        System.out.println("Digite o salario da 4 pessoa");
	        n4 = sc.nextDouble();

	        media = (n1 + n2 + n3 + n4) / 4;
	        System.out.printf("A média salarial da empresa é de R$ %.2f " , media);
	        sc.close();
	    }
	}
