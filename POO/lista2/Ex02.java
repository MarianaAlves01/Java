// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex02 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um n�mero: ");
        double n = sc.nextDouble();
        
        
        System.out.println("O n�mero " + n + (isZero(n) ? " " : " n�o") + "� zero.");
        
    }

    private static boolean isZero(double n) 
    {
        
        if(n == 0) 
        {
            return true;
        }
        
        return false;
    }

}
