public class TesteBiblioteca{
	public static void main(String[] args){
		Sócio obSocio = new Sócio("Alexandre", "380162751", 429);
		
		
		Livros testelivro = new Livros("06/05/2000", "Casas que voam", 75, "Robert Jr");
		DVD testedvd = new DVD("25/4/2019", "Endgame", 45, "Russos Brothers");
		CD testecd = new CD("30/4/1979", "TNT", 30, "System");
		
		testelivro.Multa();
		testedvd.Multa();
		testecd.Multa();
		
		obSocio.empresta(testecd, 0);
		obSocio.empresta(testedvd, 1);
		obSocio.empresta(testelivro, 2);
		
		obSocio.mostraResultados();
		
		Sócio obSocio2 = new Sócio("Roberto", "281642671", 199);
		obSocio2.empresta(testecd, 0);
		obSocio2.empresta(testedvd, 1);
		obSocio2.empresta(testelivro, 2);
		
		obSocio2.mostraResultados();
		
	}
}
