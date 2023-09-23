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
		
		System.out.print("Insira uma sequencia de 0 e 1: ");
		String sequencia = read.nextLine();
		
		int cont = 0; // conta um sequencia consecutiva de 1's
		int maior = 0; // maior sequencia consecutiva de 1's
		int len = sequencia.length(); // tamanho da cadeia
		
		
		for(int i = 0; i < len; i++)
		{
			cont = 0;
			
			while ((i < len) && (sequencia.charAt(i) == '1')) 
			{
				cont++;
				i++;
			}

			if (cont > maior)
			{	
				maior = cont;
			}
		}

      System.out.printf("\nA maior seqüência consecutiva foi de %d vez(es) o '1'.\n", maior);
    
		
	}
}

