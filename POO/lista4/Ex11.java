// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex11 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n;
        do 
        {
            System.out.print("Digite um número inteiro: ");
            n = sc.nextInt();
            
            if(n < 1) 
            {
                System.out.println("Digite um número maior ou igual a 1!");
            }
            
        } while(n < 1);
        

        System.out.printf("O número %d %s é perfeito", n , (perfeito(n) ? "" : "não"));
    }

    private static boolean perfeito(int n) 
    {
        boolean perfeito = false;
        int s = 0;
        
        for(int i = 1; i < n; i++) 
        {
            if(n % i == 0) 
            {
                s += i;
            }
        }
        if(n == s) 
        {
            perfeito = true;
        }
        
        return perfeito;
    }

}
