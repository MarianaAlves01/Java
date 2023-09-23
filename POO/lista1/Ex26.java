//Mariana Alves Cardoso - F2211313

import java.util.Random;
import java.util.Scanner;

public class Ex26 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int linha, coluna;
        do 
        {
            System.out.print("uantidade de linhas: ");
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
        
        
        for(int i = 0; i < matriz.length; i++) 
        {
            for(int j = 0; j < matriz[i].length; j++) 
            {
                for(int x = 0; x < matriz.length; x++) 
                {
                    for(int y = 0; y < matriz[x].length; y++) 
                    {
                        if(matriz[i][j] > matriz[x][y]) 
                        {
                            int auxiliar = matriz[i][j];
                            matriz[i][j] = matriz[x][y];
                            matriz[x][y] = auxiliar;
                        }
                    }
                }
            }
        }
        System.out.println("Matriz ordem decrescente:");
        
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
