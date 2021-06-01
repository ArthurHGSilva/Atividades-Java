import java.util.Scanner;
public class TesteDate{
	public static void main (String[]args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Coloque um dia: ");
		int dia = entrada.nextInt();
		
		System.out.print("Coloque um mês: ");
		int mes = entrada.nextInt();
		
		System.out.print("Coloque um ano: ");
		int ano = entrada.nextInt();
		
		Date teste = new Date(dia, mes, ano);
		teste.displayDate();
	}
}