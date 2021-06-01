public class Professor{
	private int siape;
	private String nome;
	private Endereco endereco;
	
	public Professor(int siape, String nome, Endereco endereco) {
		this.siape = siape;
		this.nome = nome;
		this.endereco = endereco;
	}
	public void setSiape(int siape) {
		this.siape = siape;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getSiape() {
		return this.siape;
	}
	public String getNome() {
		return this.nome;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void mostrarResultados() {
		System.out.println("Nome: " + this.getNome() );
		System.out.println("Siape: " + this.getSiape());
		endereco.mostrarResultados();
	}
}