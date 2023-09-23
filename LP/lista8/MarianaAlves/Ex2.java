/*
 * Ex2.java
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



import java.lang.Math;

public class Ex2 
{	
	public static void main (String[] args) 
	{
		int vetorB []  = new int[15];	
		
		//inserindo 15 números aleatórios no vetor
		for(int i = 0; i < 15; i++)
		{ 
			vetorB[i] = (int) (Math.random() * 10 - 1 + 1) + 1;
		}
		
		//exibindo os elementos do vetor em ordem contrária
		for(int i = 14; i >= 0; i--)
		{
			System.out.printf("Indice nº %d = %d \n", i+1, vetorB[i]);
		}
	}
}
