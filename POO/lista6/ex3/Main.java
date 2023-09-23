// Mariana Alves - F2211313

public class Main
{
	public static void main (String[] args) 
	{		
		Ano a = new Ano();
		
		//a.setAno(2004);
		
		System.out.print("\nO ano é " + a.getAno());
		System.out.print(" e ele" +((a.ehBi())?"":" não")+ " é bissexto.");
	}
}

