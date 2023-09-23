// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex05 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("1° valor: ");
        int n1 = sc.nextInt();
        
        System.out.print("\n2° valor: ");
        int n2 = sc.nextInt();
        
        System.out.print("\n3° valor: ");
        int n3 = sc.nextInt();
        
        

        System.out.printf("\nMaior do 1° método (dois parâmetros)\nR: %d \n", obterMaior(n1, n2));
        
        System.out.printf("\nMaior do 2° método (três parâmetros)\nR: %d \n", obterMaior(n1, n2, n3));
        
        System.out.printf("\nMaior do 3° método (ponto flutuante)\nR: %f \n", obterMaior(6.5, 8.0));
    }

    public static int obterMaior(int n1, int n2) 
    {
        if(n1 > n2) 
        {
            return n1;
        }
        return n2;
    }

    public static int obterMaior(int n1, int n2, int n3) 
    {
        if(n1 > n2 && n1 > n3) 
        {
            return n1;
        }
        else if(n2 > n1 && n2 > n3) 
        {
            return n2;
        }
        return n3;
    }

    public static double obterMaior(double n1, double n2) 
    {
        if(n1 > n2) 
        {
            return n1;
        }
        return n2;
    }

}
