/*
 * Ex12.java
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

public class Ex12 {
	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		//criando vetores
		int [] P = new int [10];
		int [] Q = new int [15];
		int [] R = new int [25];
		
		//variáveis
		int aux = 0;
		int auxtwo = 0;
		
		//obtendo os elementos do A
		for(int i = 0; i < 10; i++)
		{
			System.out.printf("VETOR P - índice nº %d = \n", i+1);
			P[i] = read.nextInt();	
		}
		
		
		//espaçamento
		System.out.println(" ");
		
		
		//obtendo os elementos do B
		for(int i = 0; i < 15; i++)
		{
			System.out.printf("VETOR Q - índice nº %d = \n", i+1);
			Q[i] = read.nextInt();
		}
		
		for(int i = 0; i < 25; i++)
		{
			if(i < 10)
			{
				R[i] = P[aux];
				aux++;
			}
			
			if(i > 9)
			{
				R[i] = Q[auxtwo];
				auxtwo++;
			}
		}
		
		//espaçamento
		System.out.println(" ");

       //exibindo o vetor R
		for(int i = 0; i < 25; i++)
		{
			System.out.printf("[%d] ", R[i]);
		}
	}
}

