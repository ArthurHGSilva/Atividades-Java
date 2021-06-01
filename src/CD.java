public class CD extends Biblioteca{
	public String nomeArtista;
	
	public CD(String data, String titulo, float preco, String nomeArtista){
		super(data, titulo, preco);
		this.nomeArtista =  nomeArtista;
	}

	public double Multa(){
		multa = (preco * 0.10) + 2;
		return multa;
	}
	
	public void mostraResultados(){
		System.out.println("-----CD-----");
		System.out.println("Artista: " + nomeArtista);
		super.mostraResultados();
	}
	
}
