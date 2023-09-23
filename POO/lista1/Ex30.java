//Mariana Alves Cardoso - F2211313

import java.util.Random;
import java.util.Scanner;

public class Ex30 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("valor: ");
        int valor = sc.nextInt();

        int vetor[] = new int[valor], maior = 0;
        
        
        System.out.println("Vetor:");
        
        for(int i = 0; i < vetor.length; i++) 
        {
            vetor[i] = rd.nextInt(9) + 1;
        }
        
        
        for(int i = 0; i < vetor.length; i++) 
        {
            if(i == 0) 
            {
                maior = vetor[i];
            }
            if(vetor[i] > maior) 
            {
                maior = vetor[i];
            }
            System.out.printf("%d ", vetor[i]);
        }
        
        int matriz[][] = new int[valor][maior + 1];
        
        for(int i = 0; i < vetor.length; i++) 
        {
            matriz[i][0] = vetor[i];
        }
        
        //espaçamento////////
        System.out.println();
        /////////////////////
        
        for(int i = 0; i < matriz.length; i++) 
        {
            matriz[i][0] = vetor[i];

        }
        
        int fibonacci[] = new int[maior], posicao = 0, a = 0, b = 1, c = 0;
        
        for(int i = 0; i < maior; i++) 
        {
            fibonacci[posicao++] = a;
            c = a + b;
            a = b;
            b = c;
        }
        
        int valorVetor = 0;
        
        for(int i = 0; i < matriz.length; i++) 
        {
            posicao = 0;
            valorVetor = vetor[i];
            
            for(int j = 1; j < matriz[i].length; j++) 
            {
                if(j <= valorVetor) 
                {
                    matriz[i][j] = fibonacci[posicao++];
                } 
                else 
                {
                    matriz[i][j] = 0;
                }
            }
        }
        
        System.out.println("Matriz:");
        
        for(int i = 0; i < matriz.length; i++) 
        {
            for(int j = 0; j < matriz[i].length; j++) 
            {
                if(matriz[i][j] > 0 || j == 1) 
                {
                    System.out.printf("%d ", matriz[i][j]);
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
