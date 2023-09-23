// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex01 
{
    
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double n = sc.nextDouble();
        
        
        System.out.println("O número " + n + ((isPositivo(n) ? " " : " não")) +" é positivo." );
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
