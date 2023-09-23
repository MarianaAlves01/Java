/*
 * Ex9.java
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

public class Ex9 
{	
	public static void main (String[] args) 
	{	
		Scanner read = new Scanner (System.in);
		
		int cont = 0;
		
		//criando vetor
		int [] vetorG = new int [5];
		int[] vetorH = new int[vetorG.length];
		
		
		//obtendo os elementos
		for(int i = 0; i < vetorG.length; i++)
		{
			System.out.printf("Valor do índice nº %d = ", i+1);
			vetorG[i] = read.nextInt();
		}
		
		//espaçamento
		System.out.println(" ");
		
		//identificando e inserindo os números pares no H
		for (int n : vetorG) 
		{ 
			// usando enhanced for
			if (n % 2 == 0) 
			{
				vetorH[cont] = n;
				cont++;
			}
		}
		
		//exibindo
		System.out.println("Os números pares são:");
		for (int i = 0; i < cont; i++) 
		{
			System.out.printf("%d ", vetorH[i]);
		}
	}
}
