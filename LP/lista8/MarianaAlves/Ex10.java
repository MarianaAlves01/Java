/*
 * Ex10.java
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

public class Ex10 {
	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		//criando vetores
		int [] PA = new int [5];
		int [] PB = new int [5];
		int [] PC = new int [10];
		
		//variáveis
		int aux = 0;
		int auxtwo = 0;
		
		//obtendo os elementos do A
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("VETOR A - índice nº %d = \n", i+1);
			PA[i] = read.nextInt();	
		}
		
		
		//espaçamento
		System.out.println(" ");
		
		
		//obtendo os elementos do B
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("VETOR B - índice nº %d = \n", i+1);
			PB[i] = read.nextInt();
		}
		
		for(int i = 0; i < 10; i++)
		{
			if(i < 5)
			{
				PC[i] = PA[aux];
				aux++;
			}
			
			if(i > 4)
			{
				PC[i] = PB[auxtwo];
				auxtwo++;
			}
		}
		
		//espaçamento
		System.out.println(" ");

       //exibindo o vetor PC
		for(int i = 0; i < 10; i++)
		{
			System.out.printf("[%d] ", PC[i]);
		}
	}
}

