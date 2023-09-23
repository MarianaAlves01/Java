// Mariana Alves - F2211313 
 

public class Ano
{	
	
	//atributos
	private int ano;
	
	//constructor
	public Ano ()
	{
		this.ano = 2023;
	}
	
	//getters and setters
	
	public int getAno()
	{
		return ano;
	}
	
	public void setAno (int ano)
	{
		this.ano = ano;
	}
	
	//methods
	public boolean ehBi()
	{
		return (getAno() % 4 == 0) && (getAno() % 100 != 0 || getAno() % 400 == 0);
	}
}

