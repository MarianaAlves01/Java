/*
 * Ex65.java
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

public class Ex65 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
		int qtd = read.nextInt();
		int numPrimo = 1;
		int fat = 1;
		boolean primo = false;
		double soma = 0.5;
		
		for(int i = 0; i < qtd; i++){
			if(i == 0)
			{
				System.out.print("-1/2 + ");
			}
			else
			{
				fat *= i;
				System.out.print(fat);
				
				for(int j = numPrimo + 1; true; j++)
				{
					for(int k = 2; k < j; k++)
					{
						if(j % k == 0)
						{
							primo = false;
						}
					}
					if(primo == true)
					{
						numPrimo = j;
						System.out.print("/" + numPrimo);
						
						if(i < qtd - 1)
						{
							if(i % 2 == 1)
							{
								System.out.print(" - ");
								soma += (double) fat / (double) numPrimo;
							}
							else
							{
								System.out.print(" + ");
								soma -= (double) fat / (double) numPrimo;
							}
						}
						break;
					}
					else{
						primo = true;
					}
				}
			}
		}
		System.out.print(" = " + soma);
	}
}

