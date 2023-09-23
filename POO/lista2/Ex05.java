// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex05 
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
        
        //espaçamento
        System.out.println();
        
        System.out.println("Raízes: \n" + calcularRaizDelta(a, b, c));
    }

    private static String calcularRaizDelta(double a, double b, double c) 
    {
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if(delta < 0) 
        {
            return String.format("As raízes são complexas!\nRaíz x\' = 0\nRaíz x\" = 0");
        } 
        else 
        {
            double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
            
            double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
            
            return String.format("X\' = %.1f\n" +
                                 "X\" = %.1f", x1, x2);
        }
    }
        
  
}
