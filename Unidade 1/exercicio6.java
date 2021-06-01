import java.util.Scanner;
public class exercicio6{
	public static void main(String[] args){ 
		criarVetor();
	}	
	public static void criarVetor(){
		
		Scanner entrada = new Scanner(System.in);

		String[] nome = new String[3];
		int[] idade = new int[3];
		int[] matricula = new int[3];
		
		for(int i=0; i<3; i++){
			System.out.println("Aluno " + i);
			
			System.out.print("Digite o nome do aluno: ");
			nome[i] = entrada.next();
			System.out.print("Digite a idade do aluno: ");
			idade[i] = entrada.nextInt();
			System.out.print("Digite a matrícula do aluno: ");
			matricula[i] = entrada.nextInt();
			
			System.out.println();		
		}
	int jovem = menor(idade);
	System.out.print("nome:" + nome[jovem]+ " " + "idade:"  + idade[jovem] + " " + "matricula:" + matricula[jovem] );
	
	}
	public static int menor(int[] cont) {
		int n = cont[0];
		int index = 0;

		for(int i=1; i < cont.length; i++) {
			if (n > cont[i]) {
				n = cont[i];
				index = i;
			}
		}
		return index;	
	}	
}
		