//Mariana Alves Cardoso - F2211313

import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("quantidade de linhas: ");
        int linha = sc.nextInt();

        System.out.print("quantidade de colunas: ");
        int coluna = sc.nextInt();


        int[][] matriz1 = new int[linha][coluna];
        int[][] matriz2 = new int[linha][coluna];
        
        Random rd = new Random();

        System.out.println("Matriz 1:");
        for(int i = 0; i < matriz1.length; i++) 
        {
            for(int j = 0; j < matriz1[i].length; j++) 
            {
                matriz1[i][j] = rd.nextInt(10);
                System.out.printf("%d ", matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matriz 2:");
        for(int i = 0; i < matriz2.length; i++) 
        {
            for(int j = 0; j < matriz2[i].length; j++) 
            {
                matriz2[i][j] = rd.nextInt(10);
                System.out.printf("%d ", matriz2[i][j]);
            }
            System.out.println();
        }


        int[][] matriz3 = new int[linha][coluna];

        System.out.println("Matriz 3:");
        for(int i = 0; i < matriz3.length; i++) 
        {
            for(int j = 0; j < matriz3[i].length; j++) 
            {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.printf("%d ", matriz3[i][j]);
            }
            System.out.println();
        }
    }

}
