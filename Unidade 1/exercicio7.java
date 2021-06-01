import java.util.Scanner;
public class exercicio7{
	public static void main(String[] args){ 
		vetor();
	}
	public static void vetor(){
		Scanner entrada = new Scanner(System.in);
		
		int[] lista= new int[10];
		
		System.out.print("Digite um número:  ");
		int n= entrada.nextInt();
		
		for(int i=0; i<lista.length; i++){
			lista[i] = multiplos(n, i);
			System.out.print(lista[i] + " ");
		}
	}
	public static int multiplos(int a, int b ){
		int posicao = a * (b+1);
		return posicao;
		
	
	
	}
}