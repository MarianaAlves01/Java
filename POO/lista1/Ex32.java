//Mariana Alves Cardoso - F2211313

import java.util.Random;
import java.util.Scanner;

public class Ex32 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("quantidade de linhas: ");
        int linha = sc.nextInt();
        
        System.out.print("quantidade de colunas: ");
        int coluna = sc.nextInt();
        

        int matriz[][] = new int[linha + 1][coluna + 1];
        

        
        for(int i = 0; i < (matriz.length - 1); i++) 
        {
            for(int j = 0; j < (matriz[i].length - 1); j++) 
            {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        
        int somaLinha[] = new int[linha];
        int somaColuna[] = new int[coluna];
        int posicaoLinha = 0;
        int posicaoColuna = 0;
        int posicao = 0;
        
        for(int i = 0; i < (matriz.length - 1); i++) 
        {
            posicaoColuna = 0;
            
            for(int j = 0; j < (matriz[i].length - 1); j++) 
            {
                somaLinha[posicaoLinha] += matriz[i][j];
                somaColuna[posicaoColuna++] += matriz[i][j];
            }
            
            posicaoColuna = 0;
            
            matriz[posicao++][coluna] = somaLinha[posicaoLinha];
            
            posicaoLinha++;
            
            for(int k = 0; k < coluna; k++) 
            {
                matriz[linha][k] = somaColuna[posicaoColuna++];
            }
        }
        
        System.out.println("Matriz:");
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
