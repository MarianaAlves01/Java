//Mariana Alves Cardoso - F2211313

import java.util.Random;

public class Ex12 
{

    public static void main(String[] args) 
    {
        int n = 4;
        int l[][] = new int[n][n];

        Random rd = new Random();
        
        System.out.println("Matriz:");
        for(int i = 0; i < l.length; i++) 
        {
            for(int j = 0; j < l[i].length; j++) 
            {
                l[i][j] = rd.nextInt(10);
                System.out.printf("%d ", l[i][j]);
            }
            System.out.println();
        }

        System.out.println("Elementos acima da diagonal principal (exlusa):");
        for(int i = 0; i < l.length; i++) 
        {
            for(int j = 0; j < l[i].length; j++) 
            {
                if(i < j) 
                {
                    System.out.printf("%d ", l[i][j]);
                } 
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
