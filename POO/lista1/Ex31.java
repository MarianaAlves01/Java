//Mariana Alves Cardoso - F2211313

import java.util.Random;
import java.util.Scanner;

public class Ex31 {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
        System.out.print("valor inicial: ");
        int inicio = sc.nextInt();
        
        System.out.print("valor final: ");
        int fim = sc.nextInt();

        int n = 4;
        int matriz[][] = new int[n][n];
        
        System.out.println("Matriz:");
        for(int i = 0; i < matriz.length; i++) 
        {
            for(int j = 0; j < matriz[i].length; j++) 
            {
                do 
                {
                    matriz[i][j] = rd.nextInt(fim) + 1;
                } while(matriz[i][j] < inicio);
                
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }    
    }

}
