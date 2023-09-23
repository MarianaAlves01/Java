/*
 * Ex15.java
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

public class Ex15 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		
		//variáveis
		int j = 0, k = 0, m = 0, a, b;
		
		
		//quantidade de termos do vetor P
		do
		{
			System.out.print("Qtd. de termos Vetor P: ");
			a = read.nextInt();
			
			if(a > 10 && a < 1)
			{
				System.out.println("Valor incorreto! Digite um num de 1 à 10.\n");
			}
		}while(a > 10 || a < 1);
		
		
		
		//quantidade de termos do vetor Q
		do
		{
			System.out.print("Qtd. de termos Vetor Q: ");
			b = read.nextInt();
			
			if(b > 15 && b < 1)
			{
				System.out.println("Valor incorreto! Digite um num de 1 à 15.\n");
			}
		}while(b > 15 || b < 1);
		
		
		//criando vetores
		int [] S = new int [a];
		int [] T = new int [b];
		
        
		
		//obtendo os elementos do S
		for(int i = 0; i < a; i++)
		{
			System.out.printf("VETOR S - índice nº %d = \n", i+1);
			S[i] = read.nextInt();	
		}
		
		
		//espaçamento
		System.out.println(" ");
		
		
		//obtendo os elementos do T
		for(int i = 0; i < b; i++)
		{
			System.out.printf("VETOR T - índice nº %d = \n", i+1);
			T[i] = read.nextInt();
		}
		
		int[] U = new int[a + b];
		
		//intercalando os valores em U
		while (j < S.length && k < T.length) 
		{
            U[m++] = S[j++];
            U[m++] = T[k++];
        }
        while (j < S.length) 
        {
            U[m++] = S[j++];
        }
        while (k < T.length) 
        {
            U[m++] = T[k++];
        }
       

       //exibindo o vetor U
		for(int i = 0; i < U.length; i++)
		{
			System.out.printf("[%d] ", U[i]);
		}
		
	}
}

