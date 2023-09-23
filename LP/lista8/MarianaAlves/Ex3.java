/*
 * Ex3.java
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

public class Ex3 
{	
	public static void main (String[] args) 
	{	
		Scanner read = new Scanner (System.in);

		System.out.print("Quantidade de posições [1 - 20]: ");
		int pos = read.nextInt();
		
		//criando vetor
		int []vetor = new int [pos];
		
		
		//obtendo os elementos
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.printf("Valor do índice nº %d = ", i+1);
			vetor[i] = read.nextInt();
		}
		
		//espaçamento
		System.out.println(" ");
			
		
		//exibindo os elementos
		for(int i = 0; i < pos; i++)
		{
			System.out.printf("Indice nº %d = %d \n", i+1, vetor[i]);
		}
		
	}
}

