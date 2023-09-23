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
		System.out.println("\nNúmero 1: " + c.getNum1() +
						  "\nNúmero 2: " + c.getNum2() +
						  "\nSoma: " + c.somar() +
						  "\nSubtração: " + c.subtrair() +
						  "\nMultiplicação: " + c.multiplicar() +
						  "\nDivisão: " + c.dividir());
		
		
	}
}

