// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex05 
{	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Insira um n�mero: ");
        int n = sc.nextInt();
        
        if(primo(n) == true)
        {
			System.out.printf("O n�mero informado [%d] � primo.", n);
		}
		else
		{
			System.out.printf("O n�mero informado [%d] n�o � primo.", n);
		}
	}
	
	public static boolean primo (int n)
	{
		boolean p = true;
		int div = 0;
		
		//verificando se o n�mero � primo
        for(int i = 1; i <= n; i++) 
        {
            if(n%i == 0) 
            {
                div++;
            }
        }
        if(div != 2) 
        {
            p = false;
        }
        
        return p;
        
	}
}

