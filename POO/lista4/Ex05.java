// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex05 
{	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Insira um número: ");
        int n = sc.nextInt();
        
        if(primo(n) == true)
        {
			System.out.printf("O número informado [%d] é primo.", n);
		}
		else
		{
			System.out.printf("O número informado [%d] não é primo.", n);
		}
	}
	
	public static boolean primo (int n)
	{
		boolean p = true;
		int div = 0;
		
		//verificando se o número é primo
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

