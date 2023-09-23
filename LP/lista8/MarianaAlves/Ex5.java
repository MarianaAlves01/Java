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

public class Ex5 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		int pos;
		
		do
		{
			System.out.print("Quantidade de posições [1 - 20]: ");
			pos = read.nextInt();
			
			//espaçamento
			System.out.println(" ");
			
		}while(pos > 15 || pos < 1);
		
		
		//criando vetores
		int [] vetorA = new int [pos];
		int [] vetorB = new int [pos];
		int [] vetorC = new int [pos];
		
		
		//obtendo os elementos do A
		for(int i = 0; i < pos; i++)
		{
			System.out.printf("VETOR A - índice nº %d = \n", i+1);
			vetorA[i] = read.nextInt();	
		}
		
		
		//espaçamento
		System.out.println(" ");
		
		
		//obtendo os elementos do B
		for(int i = 0; i < pos; i++)
		{
			System.out.printf("VETOR B - índice nº %d = \n", i+1);
			vetorB[i] = read.nextInt();
		}
		
		//espaçamento
		System.out.println(" ");
			
		
		/*
		 * somando elementos de A e B
		 * inserindo o resultado no C 
		 */
		for(int i = 0; i < pos; i++)
		{
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		//exibindo os elementos do vetor C
		for(int i = 0; i < pos; i++)
		{
			System.out.printf("Indice nº %d = %d \n", i+1, vetorC[i]);
		}	
	}
}

