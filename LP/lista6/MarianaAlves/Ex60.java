/*
 * Ex60.java
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

public class Ex60 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		boolean estaNaSequenciaDeRicci = false;
		int aux = 0;
		
		System.out.print("primeiro termo da sequencia de Ricci: ");
		int numBef = read.nextInt();
		
		System.out.print("segundo termo da sequencia de Ricci: ");
		int numNext = read.nextInt();
		
		System.out.print("numero a se procurar nesta sequencia: ");
		int numSearch = read.nextInt();
		
		if(numSearch == numBef || numSearch == numNext)
		{
			estaNaSequenciaDeRicci = true;
		}
		else
		{
			for(int i = 0; i < numSearch; i++)
			{
				System.out.printf(" " + (numNext + numBef));
				aux = numNext;
				numNext += numBef;
				numBef = aux;
				
				if(numNext == numSearch)
				{
					estaNaSequenciaDeRicci = true;
				}
			}
			
			//espaçamento
			System.out.println("");
			
			if(estaNaSequenciaDeRicci == true)
			{
				System.out.println("O número " + numSearch + " está na sequência.");
			}
			else
			{
				System.out.println("O número " + numSearch + " não está na sequência.");
			}
			
		}
	}
}

