// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex07 
{
    public static void main(String[] args) 
    {	
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        int n1 = sc.nextInt();
        
        System.out.print("Número 2: ");
        int n2 = sc.nextInt();

        
        System.out.printf("O MDC entre %d e %d é %d", n1, n2, mdc(n1, n2));
    }

    private static int mdc(int n1, int n2) 
    {
        int p[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int mdc = 1;
        
        for(int i = 0; i < p.length; i++) 
        {
            while(n1 % p[i] == 0 && n2 % p[i] == 0) 
            {
                mdc *= p[i];
                n1 /= p[i];
                n2 /= p[i];
            }
        }
        
        return mdc;
    }

}

