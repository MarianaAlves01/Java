//Mariana Alves - F2211313

import java.util.Scanner;

public class Ex03
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);      
        Scanner sc2 = new Scanner(System.in);

        char prox = ' ';
        float temp;
        boolean cont = true;
        
        while(cont)
        {
            System.out.print("[C] Celsius , [F] Fahrenheit, [K] Kelvin e [S] Sair : ");
            prox = sc2.nextLine().toLowerCase().charAt(0);
            
            switch(prox)
            {
                case 'c':
                    System.out.print("\nEntre com a temperatura: ");
                    temp = sc.nextFloat();
                    System.out.printf("\nF: %.1f \nK: %.1f\n", cToF(temp), cToK(temp));
                break;
                case 'f':
                    System.out.print("\nEntre com a temperatura: ");
                    temp = sc.nextFloat();
                    System.out.printf("\nC: %.1f \nF: %.1f \n", fToC(temp), fToK(temp));
                break;
                case 'k':
                    System.out.print("\nEntre com a temperatura: ");
                    temp = sc.nextFloat();
                    System.out.printf("\nC: %.1f \nF: %.1f \n", kToC(temp), kToF(temp));
                break;
                case 's':
                    cont = false;
                break;
                
                default:
                    System.out.println("Opção inválida!\n");
                break;
            }
        }
        
    }
    
    //from celsius
    
    public static float cToF(float temp) 
    {
        float tempF =  ( (9*temp) / 5 ) + 32;
        return tempF;
    }
    
    public static float cToK(float temp) 
    {
        float tempK =  temp + 273;
        return tempK;
    }
    
    //from Fahrenheit
    
    public static float fToC(float temp) 
    {
        float tempC =  5*(temp-32)/9;
        return tempC;
    }
    
    public static float fToK(float temp) 
    {
        float tempC =  5*(temp-32)/9;
        float tempK =  tempC + 273;
        
        return tempK;
    }
    
    //from Kelvin
     public static float kToC(float temp) 
    {
        float tempC =  temp - 273;
        return tempC;
    }
    
    public static float kToF(float temp) 
    {
        float tempC =  temp - 273;
        float tempF =  ( (9*tempC) / 5 ) + 32;
        
        return tempF;
    }
}
