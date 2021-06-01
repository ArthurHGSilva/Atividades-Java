public class Livros extends Biblioteca{
	public String autor;
	
	public Livros(String data, String titulo, float preco, String autor){
		super(data, titulo, preco);
		this.autor = autor;
	}
	
	
	public double Multa(){
		multa = preco * 0.05;
		return multa;
	}
	
	public void mostraResultados(){
		System.out.println("-----Livro-----");
		System.out.println("Autor: " + autor);
		super.mostraResultados();
	}
}
