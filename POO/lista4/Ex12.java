// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n;
        do 
        {
            System.out.print("Digite um n�mero: ");
            n = sc.nextInt();
            
            if(n < 1) 
            {
                System.out.println("Digite um n�mero maior ou igual a 1!");
            }
        } while(n < 1);
        

        System.out.printf("Sequ�ncia de n�meros perfeitos: %s", pft(n));
    }

    private static String pft(int n) 
    {
        String sq = "";
        int v;
        int s;
        
        for(int i = 1; i <= n; i++) 
        {
            v = i;
            s = 0;
            
            for(int j = 1; j < v; j++) 
            {
                if(v % j == 0) 
                {
                    s += j;
                }
            }
            if(v == s) 
            {
                sq += v + " ";
            }
        }
        
        return sq;
    }

}
