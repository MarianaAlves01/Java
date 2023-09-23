// Mariana Alves - F221313

import java.util.Scanner;

public class Ex14 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int n = sc.nextInt();

        System.out.printf("Número invertido: %s", inverter(n));
    }

    private static int inverter(int n) 
    {
        String num = Integer.toString(n);
        StringBuilder numRev = new StringBuilder(num);
        
        return Integer.parseInt(numRev.reverse().toString());
    }

}
