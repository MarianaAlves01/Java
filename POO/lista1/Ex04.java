//Mariana Alves Cardoso - F2211313

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha, coluna;
        
        do 
        {
            System.out.print("quantidade de linhas: ");
            linha = sc.nextInt();

            if(linha < 1) 
            {
                System.out.println("minimo 1 linha!");
            }

        } 
        while(linha < 1);
        
        
        do 
        {
            System.out.print("quantidade de colunas: ");
            coluna = sc.nextInt();
            if(coluna < 1) 
            {
                System.out.println("minimo 1 coluna!");
            }
        } 
        while(coluna < 1);
        
        System.out.print("valor máximo: ");
        int valorMaximo = sc.nextInt();

        int d[][] = new int[linha][coluna];
        Random rd = new Random();
        System.out.println("Matriz:");
        
        for(int i = 0; i < d.length; i++) 
        {
            for(int j = 0; j < d[i].length; j++) 
            {
                d[i][j] = rd.nextInt(valorMaximo) + 1;
                System.out.printf("%d ", d[i][j]);
            }
            System.out.println();
        }
    }

}
