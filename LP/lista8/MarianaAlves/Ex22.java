/*
 * Ex22.java
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

public class Ex22 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		int size = 0;
		
		
		// obtendo o tamanho no vetor
        do 
        {
            System.out.print("\nTamanho do vetor: ");
            size = read.nextInt();
            
            if (size < 1 && size > 20) 
            {
                System.out.println("Valor inválido! Insira uma quatidade entre (1, 20)");
            }
            
        } while (size < 1 || size > 20);
        
        //obtendo o valor maximo dos termos do vetor AC
        System.out.print("Valor máximo para os elementos: ");
        int max = read.nextInt();
		
		//criando vetor
		int [] AC = new int[size];
		
		//inserindo valores em AC
		for(int i = 0; i < AC.length; i++)
		{
			int val;
            
            do 
            {
                System.out.printf("\n[%d] = ", i);
                val = read.nextInt();
                
                if (val > max) 
                {
                    System.out.printf("O valor deve ser menor ou igual a %d.\n", max);
                }
                
            } while (val > max);
            
            AC[i] = val;
		}
		
		//espaçamento
		System.out.println(" ");
		
		//exibindo o vetor
		for (int num : AC) 
		{
			System.out.printf("[%d] ", num);
		}	
		
	}
}

