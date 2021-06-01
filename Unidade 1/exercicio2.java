import java.util.Scanner;
public class exercicio2{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dê um valor para o número 1: ");
		int a = entrada.nextInt();
		System.out.println("Dê um valor para o número 2: ");
		int b = entrada.nextInt();
		System.out.println("Escolha uma operação: soma, subtracao, divisao, multiplicaçao");
		String i = entrada.next();
		switch(i){
			case "soma": System.out.println(a+b);
			break;
			case "subtracao": System.out.println(a-b);
			break;
			case "multiplicacao":System.out.println(a*b);
			break;
			case "divisao":System.out.println(a/b);
			break;
			default:System.out.println("Comando inválido");
		}
	}
} 