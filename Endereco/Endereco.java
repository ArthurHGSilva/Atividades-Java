public class Endereco{
	private int numeroRua;
	private String cidade;
	private String estado;
	private String pais;
	
	public Endereco(int numeroRua, String cidade, String estado, String pais) {
		this.numeroRua = numeroRua;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	public void setNumeroRua(int numeroRua) {
		this.numeroRua = numeroRua;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getNumeroRua() {
		return this.numeroRua;
	}
	public String getCidade() {
		return this.cidade;
	}
	public String getEstado() {
		return this.estado;
	}
	public String getPais() {
		return this.pais;
	}
	public void mostrarResultados(){
		System.out.println("Número da rua é: " + this.getNumeroRua());
		System.out.println("Nome da cidade é: "+ this.getCidade());
		System.out.println("Nome do estado é: "+ this.getEstado());
		System.out.println("Nome do país é: " + this.getPais());
	}
}