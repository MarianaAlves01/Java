// Mariana Alves - F2211313

public class Calculadora 
{
	//atributos
	private int n1;
	private int n2;
	
	//constructor
	public Calculadora()
	{
		this.n1 = 0;
		this.n2 = 0;
	}
	
	//getters and setters
	
	/* NÚMERO 1 */
	public int getNum1 ()
	{
		return n1;
	}
	public void setNum1 (int n1)
	{
		this.n1 = n1;
	}
	
	/* NÚMERO 2 */
	public int getNum2 ()
	{
		return n2;
	}
	public void setNum2 (int n2)
	{
		this.n2 = n2;
	}
	
	//methods
	public int somar()
	{
		return getNum1() + getNum2();
	}
	
	public int subtrair()
	{
		return getNum1() - getNum2();
	}
	
	public int multiplicar()
	{
		return getNum1() * getNum2();
	}
	
	public double dividir()
	{
		return (double) getNum1() / getNum2();
	}
}

