// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex04 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //variáveis
        double a = 0;
        double b = 0;
        double c = 0;
        
        do 
        {
            System.out.print("Coeficiente A: ");
            a = sc.nextDouble();
            
            if(a == 0) 
            {
                System.out.println("ERRO! \nO valor informado tem de ser diferente de zero.");
            }
        } while(a == 0);
        
        System.out.print("Coeficiente B: ");
        b = sc.nextDouble();
        
        System.out.print("Coeficiente C: ");
        c = sc.nextDouble();
        
        System.out.println("Delta: " + calcularDelta(a, b, c));
    }

    private static double calcularDelta(double a, double b, double c) 
    {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

}
