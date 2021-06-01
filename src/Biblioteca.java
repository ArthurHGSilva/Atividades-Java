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
		this.disponibilidade = "Disponível";
		this.multa = 0;
		
		
	}

	public abstract double Multa();
	
	public void Situacao(){
		if(disponibilidade == "Disponível") {
			disponibilidade = "Emprestado";
		}else{
			disponibilidade = "Este produto já foi emprestado, aguarde a devolução do produto";
		}
	}
	
	public void mostraResultados(){
		System.out.println("Título: " + titulo);
		System.out.println("Data: " + data);
		System.out.println("Preco: " + preco);
		System.out.println("Situação: " + disponibilidade);
		System.out.println("Multa: " + Multa());
	}
	
	
}
