// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex03 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um n�mero: ");
        double n = sc.nextDouble();
        
        System.out.println("O n�mero " + n + " � " + valor(n));    
    }

    private static String valor(double numero) 
    {
        if(numero > 0) 
        {
            return "POSITIVO";
        } 
        else if(numero < 0) 
        {
            return "NEGATIVO";
        } 
        else 
        {
            return "ZERO";
        }
    }

}
