import java.util.Scanner;
public class Operacao2{
		int somar;
		int subtracao;
		int multiplicacao;
		
		public void soma(int a, int b){
		somar = a + b;
		}
		
		public void subtrair(int a, int b){
		subtracao = a - b;
		}
			
		public void multiplicar(int a, int b){
		multiplicacao = a * b;
		}
		
		public void mostraResultado(){
		System.out.print("O resultado da soma �: " +  somar + 
		"\n O resultado da subtra��o �: " + subtracao + 
		"\n O resultado da multiplica��o �: " + multiplicacao);
		}
	
}