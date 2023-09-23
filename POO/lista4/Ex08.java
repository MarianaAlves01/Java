// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex08 
{
    public static void main(String[] args) 
    {	
        Scanner sc = new Scanner(System.in);
        
        //obtendo a qtd de itens a serem colocados no MDC
        int qtd;
        do 
        {
            System.out.print("Quantidade de itens: ");
            qtd = sc.nextInt();
            
            if(qtd < 1) 
            {
                System.out.println("O valor deve ser >= 1!");
            }
            
        } while(qtd < 1);
        int [] n = new int [qtd];
		
		//inserindo números
		for(int i = 0; i < n.length; i++)
		{
			System.out.print("Entre com o " + (i+1) + "° : ");
			n[i] = sc.nextInt();
			
		}

        
        System.out.printf("MDC: %d", mdc(n));
    }

    private static int mdc(int[] n)
    {
        int res = n[0];
        
        for(int i = 1; i < n.length; i++)
        {
			while(n[i] != 0)
			{
                int r = res % n[i];
                res= n[i];
                n[i] = r;
            }
      
        }
        
        return res;
    }

}

