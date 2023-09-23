// Mariana Alves - F2211313

import java.util.Scanner;

public class Main 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Conta conta = new Conta();
		
        int pessoas = 0, res = 0;;
        double valor = 0.0, total = 0.0;
        
        
        
        
        //obtendo o valor da conta
        do 
        {
            System.out.print("Valor da conta: R$ ");
            valor = sc.nextDouble();
            
            if(valor < 0 || valor > 1000) 
            {
                System.out.println("Por favor, digite um valor válido!");
            }
            
        } while(valor < 0 || valor > 1000);

        
        
        
        //obtendo a quantidade de pessoas
        do 
        {
            System.out.print("Quantidade de pessoas: ");
            pessoas = sc.nextInt();
            
            if(pessoas <= 0) 
            {
                System.out.println("Por favor, digite um valor válido!");
            }
            
        } while(pessoas <= 0);
        
        

        //obtendo resposta do usuário sobre o pagamento da gorjeta
        do 
        {
            System.out.print("Pagar 10% para o garçom?\n1. Não\n2. Sim\n");
            res = sc.nextInt();
            
            if(res < 1 || res > 2) 
            {
                System.out.println("Por favor, digite um valor válido!");
            }
            
        } while(res < 1 || res > 2);

        
        if(res == 1) 
        {
            total = conta.close(valor, pessoas);
        } 
        else 
        {
            total = conta.tips(valor, pessoas);
        }

        
       //exibindo o resultado
        System.out.printf("Cada um dos %d amigos pagará R$ %.2f\n", pessoas, total);
    	
	}
}

