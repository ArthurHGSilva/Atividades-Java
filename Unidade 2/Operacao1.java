import java.util.Scanner;
public class Operacao1{
	int num1;
 	int num2;
	int soma;
	int subtracao;
	int multiplicacao;
	
	public void recebeDados(){
		Scanner entrada =  new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		num1 = entrada.nextInt();	
		System.out.print("Digite um n�mero: ");
		num2 = entrada.nextInt();
	}
	
	public void somar(){
		soma = num1 + num2;
	} 
	
	public void subtrair(){
		subtracao = num1 - num2;
	}
	
	public void multiplicar(){
		multiplicacao = num1 * num2;
	}
	
	public void mostraResultado(){
		System.out.println("O resultado da soma �: " + soma); 	
		System.out.println("O resultado da subtra��o �: " + subtracao);
		System.out.println("O resultado da multiplica��o �: " + multiplicacao);
	}

	
}
	
	