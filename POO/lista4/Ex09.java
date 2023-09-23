// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex09 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n[] = new int[2];

        for (int i = 0; i < n.length; i++) 
        {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            n[i] = sc.nextInt();
        }

        System.out.printf("MMC: %d", mmc(n));
        
    }

    private static int mmc(int [] n) 
    {
        int p[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        
        int mmc = 1;
        
        for(int i = 0; i < p.length; i++) 
        {
            while(n[0] % p[i] == 0 || n[1] % p[i] == 0) 
            {
                mmc *= p[i];
                
                if(n[0] % p[i] == 0) 
                {
                    n[0] /= p[i];
                } 
                
                if(n[1] % p[i] == 0) 
                {
                    n[1] /= p[i];
                }
                
            }
        }
        
        return mmc;
    }

}
