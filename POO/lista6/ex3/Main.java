// Mariana Alves - F2211313

public class Main
{
	public static void main (String[] args) 
	{		
		Ano a = new Ano();
		
		//a.setAno(2004);
		
		System.out.print("\nO ano � " + a.getAno());
		System.out.print(" e ele" +((a.ehBi())?"":" n�o")+ " � bissexto.");
	}
}

