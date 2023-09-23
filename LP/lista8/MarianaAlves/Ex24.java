/*
 * Ex24.java
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

public class Ex24
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		int size = (int) (Math.random() * 10 + 1);
		
        int[] AE = new int[size];
        
        for (int i = 0; i < AE.length; i++) 
        {
            int val;
            
            do 
            {
                System.out.printf("[%d] = ", i);
                val = read.nextInt();
                
                if (val % 2 == 0) 
                {
                    System.out.println("O valor deve ser ímpar.");
                }
            } while (val % 2 == 0);
            
            AE[i] = val;
        }
        
        //espaçamento
		System.out.println(" ");
		
        System.out.print("Vetor: ");
		
		//exibindo o vetor
		for (int num : AE) 
		{
			System.out.printf("[%d] ", num);
		}	
        
        //espaçamento
		System.out.println(" ");
		
        System.out.print("\nVetor ordenado: ");
        
        //ordenando de maneira crescente
        int aux;
        for (int i = 0; i < AE.length; i++) 
        {
            for (int j = i + 1; j < AE.length; j++) 
            {
                if (AE[i] > AE[j]) 
                {
                    aux = AE[j];
                    AE[j] = AE[i];
                    AE[i] = aux;
                }
            }
        }
        
        //exibindo o vetor
		for (int num : AE) 
		{
			System.out.printf("[%d] ", num);
		}	
	}
}

