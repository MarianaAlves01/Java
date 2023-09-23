/*
 * Ex7.java
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

public class Ex7 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		int[] qtd = new int [26];
		
		//zerando todos os valores do array
		for(int a = 0; a < 26; a++)
		{
			qtd[a] = 0;
		}
		
		System.out.print("insira uma frase: ");
		String quote = read.nextLine().toUpperCase();
		
		
		for(int i = 97; i < 123; i++)
		{
			for(int j = 0; j < quote.length(); j++)
			{
				
				if(quote.charAt(j) == (char)(i - 32))
				{
					qtd[i - 97]++;
				}
			}
		}
		
		for(int i = 0; i < 26; i++)
		{
			System.out.printf("%c: %d |", (char) (i + 65), qtd[i]);
		}
	}
}

