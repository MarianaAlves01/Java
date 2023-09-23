//Mariana Alves Cardoso - F2211313

import java.util.Random;
import java.util.Scanner;

public class Ex28 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		Random rd = new Random();

        int linha;
        int coluna;
        
        do 
        {
            System.out.print("quantidade de linhas: ");
            linha = sc.nextInt();
            
            if(linha <= 0) 
            {
                System.out.println("valor inválido!");
            }
        } while(linha <= 0);
        
        do 
        {
            System.out.print("quantidade de colunas: ");
            coluna = sc.nextInt();
            if(coluna <= 0) 
            {
                System.out.println("valor inválido!");
            }
        } while(coluna <= 0);

        int matriz[][] = new int[linha][coluna];
        
        
        System.out.println("Matriz:");
        for(int i = 0; i < matriz.length; i++) 
        {
            for(int j = 0; j < matriz[i].length; j++) 
            {
                matriz[i][j] = rd.nextInt(10);
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        
        for(int j = (coluna - 1); j >= 0; j--) 
        {
            for(int i = (linha - 1); i >= 0; i--) 
            {
                for(int x = (i - 1); x >= 0; x--) 
                {
                    if(matriz[i][j] < matriz[x][j]) 
                    {
                        int auxiliar = matriz[i][j];
                        matriz[i][j] = matriz[x][j];
                        matriz[x][j] = auxiliar;
                    }
                }
            }
        }
        
        System.out.println("Colunas ordem crescente:");
        for(int i = 0; i < matriz.length; i++) 
        {
            for(int j = 0; j < matriz[i].length; j++) 
            {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        
    }

}
