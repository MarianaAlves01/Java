// Mariana Alves - F2211313 

public class Numero 
{
	//atributos
	private int numero;
	
	//constructor
	public Numero ()
	{
		this.numero = 0;
	}
	
	//getters and setters
	public int getNumero()
	{
		return numero;
	}
	
	public void setNumero(int numero)
	{
		this.numero = numero;
	}
	
	//methods
	public int inverter ()
	{
		String n = Integer.toString(getNumero());
		
		StringBuilder rev = new StringBuilder(n);
		
        return Integer.parseInt(rev.reverse().toString()); 
	}
		
}

