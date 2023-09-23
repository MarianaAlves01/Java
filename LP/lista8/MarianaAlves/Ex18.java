/*
 * Ex18.java
 * 
 * Copyright 2022 Mariana Alves <Mariana Alves@DESKTOP-BDG0JMS>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;

public class Ex18 
{	
	public static void main (String[] args) 
	{
		
		Scanner read = new Scanner (System.in);
		
		//variaveis
		int cont = 0, qtd, numero, fatorial, aux = 0;	
		
		//obtendo a quantidade de termos da sequencia
		do
		{
			System.out.print("Quantidade de termos: ");
			qtd = read.nextInt();
			
			if(qtd > 15 || qtd < 1)
			{
				System.out.println("\nQuantidade deve ser de 1 à 15!\n");
			}
		}
		while(qtd > 15 || qtd < 1);
		
		//criando vetor Y
		int[] Y = new int[qtd];
		
		
		//obtendo os valores da sequencia e inserindo no vetor Y
		for (int i = 1; i <= qtd; i++) 
		{
            numero = i;
            fatorial = 1;
            
            for (int j = numero; j >= 1; j--) 
            {
                fatorial *= j;
            }
            
            Y[aux++] = fatorial;
        }
        
        
        //exibindo o vetor Y
        
        System.out.println("Vetor com a sequência de fatorial: ");
        
        for(int k = 0; k < Y.length; k++)
        {
			System.out.printf("[%d] ", Y[k]);
		}
        
	}
}

