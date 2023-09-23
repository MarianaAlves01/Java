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
            System.out.print("Digite um n�mero inteiro: ");
            n = sc.nextInt();
            
            if(n < 1) 
            {
                System.out.println("Digite um n�mero maior ou igual a 1!");
            }
            
        } while(n < 1);
        

        System.out.printf("O n�mero %d %s � perfeito", n , (perfeito(n) ? "" : "n�o"));
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
