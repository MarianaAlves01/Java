// Mariana Alves - F2211313

public class Main 
{	
	public static void main (String[] args) 
	{		
		Bhaskara equacao1 = new Bhaskara(3, 12, -63);
        Bhaskara equacao2 = new Bhaskara(1, -14, 48);

        System.out.println("\nEquação 1: " + equacao1.exibir());
        
        System.out.println("\nEquação 2: " + equacao2.exibir());
	}
}

