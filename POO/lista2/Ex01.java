// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex01 
{
    
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um n�mero: ");
        double n = sc.nextDouble();
        
        
        System.out.println("O n�mero " + n + ((isPositivo(n) ? " " : " n�o")) +" � positivo." );
    }

    
    private static boolean isPositivo(double n) 
    {
        if(n >= 0) 
        {
            return true;
        }
        
        return false;
    }

}
