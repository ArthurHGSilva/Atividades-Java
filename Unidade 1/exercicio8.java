import java.util.Scanner;
public class exercicio8{
	public static void main(String [] args){
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a quantidade de alunos: ");
		int qtdAluno = entrada.nextInt();
		
		String[] nome = new String[qtdAluno];
		double[] n1 = new double[qtdAluno];
		double[] n2 = new double[qtdAluno];
		double[] media = new double[qtdAluno];
		double[] mediac = new double[qtdAluno];
		
		for(int x=0; x < nome.length; x++){
			
			System.out.print("Digite o nome do aluno: ");
			nome[x] = entrada.next();
			System.out.print("Digite a nota 1 de " + nome[x] + ": ");
			n1[x] = entrada.nextDouble();
			System.out.print("Digite a nota 2 de " + nome[x] + ": ");
			n2[x] = entrada.nextDouble();
			media[x] = (n1[x] + n2[x])/2;
			System.out.println(media[x]);
			System.out.println();
			
			if(media[x] >= 6){
				System.out.println(nome[x] + " foi aprovado");}
			else{
				System.out.println(nome[x] + " foi reprovado");}
			System.out.println();		
		}
		
		double mediasala = 0;
		for(int x=0; x < nome.length; x++){
			mediasala = (mediasala + media[x]);
		}
		System.out.print(mediasala / qtdAluno);
		
	}
		
		
}