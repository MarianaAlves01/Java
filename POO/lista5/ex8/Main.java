/// Mariana Alves - F2211313

public class Main 
{	
	public static void main (String[] args) 
	{
		System.out.printf("m² p/ p²: %.2f\n", ConversaoUnidades.metroQuadradoParaPeQuadrado(1));
        System.out.printf("p² p/ cm²: %.2f\n", ConversaoUnidades.peQuadradoParaCentimetroQuadrado(1));
        System.out.printf("Milha² p/ acre: %.2f\n", ConversaoUnidades.milhaQuadradaParaAcre(1));
        System.out.printf("Acre p/ p²: %.2f\n", ConversaoUnidades.acreParaPeQuadrado(1));
	}
}

