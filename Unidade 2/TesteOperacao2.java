import java.util.Scanner;
public class TesteOperacao2{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Coloque o valor de a: ");
		int a = entrada.nextInt();
		System.out.print("Coloque o valor de b: ");
		int b = entrada.nextInt();
		
		Operacao2 teste = new Operacao2();
		teste.soma(a, b);
		teste.subtrair(a, b);
		teste.multiplicar(a, b);
		teste.mostraResultado();
	}
}