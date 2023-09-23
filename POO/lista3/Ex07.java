// Mariana Alves - F2211313

import java.util.Random;
import java.util.Scanner;

public class Ex07
{	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		char prox = ' '; 
		
		do 
        {
			System.out.printf("%d \n", dado());	         
            System.out.print("\njogar dado [s/n]? ");
            prox = sc.nextLine().toLowerCase().charAt(0);
            
            //espaçamento
            System.out.println("\n");
            
        } while(prox == 's');
        
    }
	
	private static int dado() 
	{
       Random rd = new Random();
       return (rd.nextInt(6) + 1);
    }
}

