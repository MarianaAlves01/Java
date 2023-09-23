// Mariana Alves - F2211313

import java.util.Scanner;

public class Ex06 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);      
        Scanner sc2 = new Scanner(System.in);

        char prox = ' ';
        int cont = 0; 
        int menor = 0;
        
        do 
        {
            System.out.print("insira um número: ");
            int n = sc.nextInt();
            
            if(cont == 0) 
            {
                menor = n;
                cont++;
            } 
            else 
            {
                menor = obterMenor(menor, n);
            }
            
            System.out.print("\ncontinuar [s/n]? ");
            prox = sc2.nextLine().toLowerCase().charAt(0);
            
            //espaçamento
            System.out.println("\n");
            
        } while(prox == 's');


        System.out.printf("\nO menor valor informado foi %d ", menor);
    }

    private static int obterMenor(int anterior, int posterior) 
    {
        return Math.min(anterior, posterior);
    }

}
