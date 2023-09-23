//Mariana Alves - F2211313

import java.util.Scanner;

public class Ex02 
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
            System.out.print("[C] Celsius , [F] Fahrenheit e [S] Sair : ");
            prox = sc2.nextLine().toLowerCase().charAt(0);
            
            switch(prox)
            {
                case 'c':
                    System.out.print("\nEntre com a temperatura: ");
                    temp = sc.nextFloat();
                    System.out.printf("\nA temperatura em Fahrenheit é: %.1f \n", cToF(temp));
                break;
                case 'f':
                    System.out.print("\nEntre com a temperatura: ");
                    temp = sc.nextFloat();
                    System.out.printf("\nA temperatura em Celsius é: %.1f \n", fToC(temp));
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
    
    public static float cToF(float temp) 
    {
        float tempF =  ( (9*temp) / 5 ) + 32;
        return tempF;
    }
    
    public static float fToC(float temp) 
    {
        float tempC =  5*(temp-32)/9;
        return tempC;
    }
}
