// Mariana Alves - F2211313

public class Main {
	
	public static void main (String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Marcos Leaonardo");
		p1.setIdade(18);
		p1.setAltura(1.75);
		p1.fazAniversario(false);
		
		
		System.out.printf("\nNome: %s\nIdade: %d\nAltura: %.2f\n", p1.getNome(), p1.getIdade(), p1.getAltura() );
		
		
		p1.fazAniversario(true);
		System.out.printf("\nNome: %s\nIdade: %d\nAltura: %.2f\n", p1.getNome(), p1.getIdade(), p1.getAltura() );

	}
}

