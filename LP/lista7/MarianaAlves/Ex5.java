/*
 * Ex5.java
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

public class Ex5 {
	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		System.out.print("Insira uma frase: ");
		
		//variáveis
		String frase = read.nextLine();
		int cont = 0;
		
		for(int i = 0; i < frase.length(); i++)
		{
			if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'A'))
			{
				cont++;
			}
		}
		
		System.out.println("\nA letra 'a' foi utilizada " + cont + " vezes.");
		
	}
}

