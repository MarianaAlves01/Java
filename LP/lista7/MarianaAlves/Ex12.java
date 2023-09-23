/*
 * Ex12.java
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

public class Ex12 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		System.out.print("insira um frase: ");
		String quote = read.nextLine().toUpperCase();
		
		int a = 0, 
			e = 0, 
			i = 0, 
			o = 0, 
			u = 0;
		
		for(int j = 0; j < quote.length(); j++)
		{
			if(quote.charAt(j) == 'A')
			{
				a++;
			}
			if(quote.charAt(j) == 'E')
			{
				e++;
			}
			if(quote.charAt(j) == 'I')
			{
				i++;
			}
			if(quote.charAt(j) == 'O')
			{
				o++;
			}
			if(quote.charAt(j) == 'U')
			{
				u++;
			}
		}
		
		System.out.printf("\n%d letra(s) A. \n%d letra(s) E. \n%d letra(s) I. \n%d letra(s) O. \n%d letra(s) U.", a, e, i, o, u);
	
	}
}

