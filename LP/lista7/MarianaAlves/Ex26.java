/*
 * Ex26.java
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
import java.util.Random;
import java.util.Scanner;

public class Ex26 
{
	public static void main (String[] args) 
	{
		
		String letras = "";
		
		int[] qtd = new int [26];
		//zerando todos os valores do array
		for(int a = 0; a < 26; a++)
		{
			qtd[a] = 0;
		}
		
		
		for(int i = 1; i <= 100; i++)
		{
			int r = new Random().nextInt((122 - 97) + 1) + 97;
			letras += (char) r;
		}
		
		letras = letras.toUpperCase();
		
		//reconhecendo as letras que não aparecem
		for(int j = 97; j < 123; j++)
		{
			for(int k = 0; k < letras.length(); k++)
			{
				if(letras.charAt(k) == (char)(j - 32))
				{
					qtd[j - 97]++;
				}
			}
		}
		
		
		//letras que não aparecem
		System.out.print("Letras que não aparecem: ");
		
		for(int i = 0; i < 26; i++)
		{
			if(qtd[i] == 0)
			{
				System.out.printf("%c ", (char) (i + 65));
			}
			
		}
	
		System.out.print("\n\n" + letras);
	}
}

