import java.util.Scanner;
public class exercicio1{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero para a: ");
		int a = entrada.nextInt();
		System.out.println("Digite um n�mero para b: ");
		int b = entrada.nextInt();
		System.out.println("Digite um n�mero para c: ");
		int c = entrada.nextInt();
		System.out.println("Digite um n�mero para d: ");
		int d = entrada.nextInt();
		int soma = a+b+c+d;	
		System.out.println("A soma �: " + soma);
	}
}