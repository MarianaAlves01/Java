// Mariana Alves - F2211313 

public class Main 
{	
	public static void main (String[] args) 
	{		
		//criando objeto
		Calculadora c = new Calculadora();
		
		//setando valores
		c.setNum1(2);
		c.setNum2(10);
		
		//exibindo
		System.out.println("\nN�mero 1: " + c.getNum1() +
						  "\nN�mero 2: " + c.getNum2() +
						  "\nSoma: " + c.somar() +
						  "\nSubtra��o: " + c.subtrair() +
						  "\nMultiplica��o: " + c.multiplicar() +
						  "\nDivis�o: " + c.dividir());
		
		
	}
}

