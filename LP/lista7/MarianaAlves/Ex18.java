/*
 * Ex18.java
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

public class Ex18 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		System.out.print("Insira uma seqüência binária (8 bits): ");
		String sequencia = read.nextLine();

		boolean eleEh = true;
		
		if(sequencia.length() != 8)
		{
			eleEh = false;
		}
		else
		{
			for(int i = 0; i < sequencia.length(); i++)
			{
				if((sequencia.charAt(i) != '0') && (sequencia.charAt(i) != '1'))
				{
					eleEh = false;
				}
			}
			
		}
			
		System.out.print("\n" + ((eleEh == true)?"":"Não ") + "É Uma Seqüência Binária de 8 bits.");
	}
}

