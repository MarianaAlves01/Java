// Mariana Alves - F2211313


import java.util.Scanner;

public class Ex01 
{
    
    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro n�mero: ");
        int n1 = sc.nextInt();
        
        System.out.print("Segundo n�mero: ");
        int n2 = sc.nextInt();
        
        
        System.out.printf("\nO maior valor � %d", obterMaior(n1, n2));
    }

    private static int obterMaior(int n1, int n2) 
    {
        if(n1 > n2) 
        {
            return n1;
        }
        return n2;
    }

}
