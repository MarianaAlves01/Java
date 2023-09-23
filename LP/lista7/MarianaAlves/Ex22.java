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
		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe uma frase: ");
		String quote = read.nextLine().toUpperCase();

		System.out.printf("\nInforme uma palavra: ");
		String word = read.nextLine().toUpperCase();
		
		int contador = 0;
		
		for(int i = 0; i < quote.length(); i++)
		{
			if(quote.charAt(i) == word.charAt(0))
			{
				int j = 1;
				
				do
				{
					j++;
						
					if(j == word.length())
					{
						contador++;
					}
				}while( ( ((i+j) < quote.length()) && (j < word.length()) && (quote.charAt(i+j)) == word.charAt(j) ));
			}
		}
		
		System.out.printf("\nA palavra foi encontrada %d vezes na frase.\n", contador);
		
	}
}

