// Mariana Alves - F2211313


import java.util.Scanner;
import java.lang.Math;

public class Ex03 
{
    
    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int n1 = sc.nextInt();
        
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();
        
        
        System.out.printf("\nO maior valor é %d", obterMaior(n1, n2));
    }

    private static int obterMaior(int n1, int n2) 
    {
        
        return Math.max(n1,n2);
    }

}


