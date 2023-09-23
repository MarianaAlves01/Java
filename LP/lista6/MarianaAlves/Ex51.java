/*
 * Ex51.java
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

public class Ex51 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner (System.in);
		
		//variáveis
		int 
		numBef = 0, 
		numNex = 1, 
		aux,
		qtd;
		
		System.out.print("Quantidade de termos: ");
		qtd = read.nextInt();
		
		
		
		for(int i = 0; i < qtd; i++)
		{
			if(i == 0 || i == 1)
			{
				System.out.print(" " + i);
			}
			else
			{
				System.out.print(" " + ( numNex + numBef) );
				
				aux = numNex;
				numNex += numBef;
				numBef = aux;
			}
		}
		
	}
}

