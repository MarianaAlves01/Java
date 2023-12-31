//Mariana Alves Cardoso - F2211313

import java.util.Random;
import java.util.Scanner;

public class Ex27 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
        int linha, coluna;
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
            if(coluna <= 0) {
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
        
        for(int i = 0; i < matriz.length; i++) 
        {
            for(int j = (matriz[i].length - 1); j >= 0; j--) 
            {
                for(int x = (j - 1); x >= 0; x--) 
                {
                    if(matriz[i][j] < matriz[i][x]) 
                    {
                        int auxiliar = matriz[i][j];
                        matriz[i][j] = matriz[i][x];
                        matriz[i][x] = auxiliar;
                    }
                }
            }
        }

        System.out.println("Linhas ordem crescente:");
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
