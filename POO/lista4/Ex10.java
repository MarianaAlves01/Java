// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int quantidade;
        do 
        {
            System.out.print("Digite a quantidade de números: ");
            quantidade = sc.nextInt();
            
            if(quantidade < 1) 
            {
                System.out.println("Digite um valor maior ou igual a 1!");
            }
        } while(quantidade < 1);

        int numeros[] = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) 
        {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = sc.nextInt();
        }
        

        System.out.println("O MMC entre os números digitados é " + mmc(numeros));
    }

    private static int mmc(int n1, int n2) 
    {
        int n = 2;
        int r = 1;
        
        while(n1 != 1 || n2 != 1) 
        {
            while(n1 % n != 0 && n2 % n != 0) 
            {
                n++;
            }
            
            if(n1 % n == 0) 
            {
                n1 = n1 / n;
            }
            if(n2 % n == 0) 
            {
                n2 = n2 / n;
            }
            r *= n;
        }
        return r;
    }

    private static int mmc(int[] n) 
    {
        int r = n[0];
        
        for(int i = 0; i < n.length; i++)
        {
            r = mmc(r, n[i]);
        }
        return r;
    }

}
