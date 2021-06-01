import java.util.Scanner;
public class exercicio4{
	public static void main(String[] args){ 
		Scanner entrada = new Scanner(System.in);
		
		int soma;
		int vezes;
		
		System.out.println("Digite um número para num1: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite um número para num2: ");
		int num2 = entrada.nextInt();
		soma = resultado(num1, num2);
		vezes = quadrado(num1, num2);
		  
	}
	public static int resultado(int num1, int num2){
	int somar;
	Scanner entrada = new Scanner(System.in);
	somar = num1 + num2;
	System.out.println("A soma dos números é: " + somar);
	return somar;
	}
	
	public static int quadrado(int num1, int num2){
	int multi;
	Scanner entrada = new Scanner(System.in);
	multi = num1 * num1 + num2 * num2;
	System.out.println("A soma dos quadrados dos dois números é: " + multi);
	return multi;
	}

}