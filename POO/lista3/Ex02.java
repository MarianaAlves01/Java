// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex02 
{
	
	public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int n1 = sc.nextInt();
        
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();
        
        
        System.out.printf("\nO menor valor é %d", obterMenor(n1, n2));
    }

    private static int obterMenor(int n1, int n2) 
    {
        if(n1 < n2) 
        {
            return n1;
        }
        return n2;
    }
}

