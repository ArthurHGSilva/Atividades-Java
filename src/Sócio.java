public class S�cio {
	public String nome;
	public String RG;
	public int numero;
	Biblioteca[] docEmprestados;
	
	public S�cio(String nome, String RG, int numero){
		this.nome = nome;
		this.RG = RG;
		this.numero = numero;
		this.docEmprestados = new Biblioteca[3];
	} 
	
	public void empresta(Biblioteca ob, int i) {
		if (i > 2 && i < 0) {
			System.out.println("Este espa�o n�o pode ser alocado."); 
		
		}else {		
			docEmprestados[i] = ob;
			ob.Situacao();
		}
	}

	public void mostraResultados() {
		System.out.println("S�cio: " + nome);
		System.out.println("RG: " + RG);
		System.out.println("Matr�cula: " + numero);
		
		for(int i=0; i<3; i++){
			System.out.println("");
			docEmprestados[i].mostraResultados();
			System.out.println("");
		}
	}
}
