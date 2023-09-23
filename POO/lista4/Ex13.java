// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int qtd = sc.nextInt();
        
        int nums[] = new int[qtd], pft[];
        
        for(int i = 0; i < nums.length; i++) 
        {
            System.out.printf("Digite  o %d° número: ", (i +  1));
            nums[i] = sc.nextInt();
        }
        

        pft = pft(nums);
        
        for(int i = 0; i < pft.length; i++) 
        {
            if(pft[i] > 0) 
            {
                System.out.print(pft[i] + " ");
            }
        }
        System.out.println();
    }

    private static int[] pft(int[] nums) 
    {
        int n, soma = 0, pft[] = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) 
        {
            n = nums[i];
            s = 0;
            for(int j = 1; j < n; j++) 
            {
                if(n % j == 0) 
                {
                    s += j;
                }
            }
            if(n == s) 
            {
                pft[i] = nums[i];
            }
        }
        return pft;
        
    }

}

