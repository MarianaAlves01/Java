//Mariana Alves - F2211313

import java.util.Scanner;

public class Ex01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Entre com temperatura em Celsius: ");
        float tempC = sc.nextFloat();
        
        System.out.printf("\nA temperatura em Fahrenheit é: %.1f \n", nhe(tempC));
        
    }
    
    public static float nhe(float tempC) {
        float tempF =  ( (9*tempC) / 5 ) + 32;
        return tempF;
    }
    
}
