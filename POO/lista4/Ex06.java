// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex06 
{	
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("valor: ");
        int s = sc.nextInt();
        
        System.out.print("Outro valor: ");
        int e = sc.nextInt();
        

        if(e < s) 
        {
            int a = s;
            s = e;
            e = a;
        }
        
        int qtd = ctPrimo(s, e);
        
        int[] p = new int[qtd];
        
        p = primos(s, e, p);
        
        System.out.printf("Primos entre %d e %d:\n", s, e);
        
        for(int i = 0; i < p.length; i++) 
        {
            System.out.printf("%d ", p[i]);
        }
        
        //espaçamento
        System.out.println("");
    }

    private static int ctPrimo(int s, int e) 
    {
        int n, d, ct = 0;
        
        for(int i = s; i <= e; i++) 
        {
            n = i;
            d = 0;
        
            for(int j = 1; j <= n; j++) 
            {
                if(n % j == 0) 
                {
                    d++;
                }
            }
            
            if(d == 2) 
            {
                ct++;
            }
        }
        
        return ct;
    }

    private static int[] primos(int s, int e, int[] p) 
    {
        int n, d, pos = 0;
        
        for(int i = s; i <= e; i++) 
        {
            n = i;
            d = 0;
            
            for(int j = 1; j <= n; j++) 
            {
                if(n % j == 0) 
                {
                    d++;
                }
            }
            if(d == 2) 
            {
                p[pos++] = n;
            }
        }
        
        return p;
    }
}

