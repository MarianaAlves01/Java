//Mariana Alves Cardoso - F2211313

import java.util.Random;
import java.util.Scanner;

public class Ex06 
{
   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("quantidade de linhas: ");
        int linha = sc.nextInt();

        System.out.print("quantidade de colunas: ");
        int coluna = sc.nextInt();

        System.out.print("verificar se existe na matriz: ");
        int valor = sc.nextInt();
        

        int matriz[][] = new int[linha][coluna], 
			contador = 0;
			
        String posicoes = "";

        Random rd = new Random();
        
        for(int i = 0; i < matriz.length; i++) 
        {
            for(int j = 0; j < matriz[i].length; j++) 
            {
                matriz[i][j] = rd.nextInt(25);
                System.out.printf("%d ", matriz[i][j]);

                if(matriz[i][j] == valor) 
                {
                    posicoes += String.format("[%d][%d] ", i, j);
                    contador++;
                }
            }
            System.out.println();
        }
        
        System.out.println("Posições que o valor " + valor + " foi encontrado: " + posicoes);
        System.out.println("ocorrências do valor " + valor + " na matriz: " + contador);
    }
    
}
