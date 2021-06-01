public abstract class Biblioteca {
	public String data;
	public String titulo;
	public double preco;
	public String disponibilidade;
	public double multa;
	
	public Biblioteca(String data, String titulo, double preco){
		this.data =  data;
		this.titulo = titulo;
		this.preco = preco;
		this.disponibilidade = "Dispon�vel";
		this.multa = 0;
		
		
	}

	public abstract double Multa();
	
	public void Situacao(){
		if(disponibilidade == "Dispon�vel") {
			disponibilidade = "Emprestado";
		}else{
			disponibilidade = "Este produto j� foi emprestado, aguarde a devolu��o do produto";
		}
	}
	
	public void mostraResultados(){
		System.out.println("T�tulo: " + titulo);
		System.out.println("Data: " + data);
		System.out.println("Preco: " + preco);
		System.out.println("Situa��o: " + disponibilidade);
		System.out.println("Multa: " + Multa());
	}
	
	
}
