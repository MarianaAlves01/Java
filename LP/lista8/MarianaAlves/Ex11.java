/*
 * Ex11.java
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

public class Ex11 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		
		//criando vetores
		int [] QA = new int [5];
		int [] QB = new int [5];
		int [] QC = new int [10];
		
		//variáveis
		int aux = 0;
		
		
		//obtendo os elementos do A
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("VETOR A - índice nº %d = \n", i+1);
			QA[i] = read.nextInt();	
		}
		
		
		//espaçamento
		System.out.println(" ");
		
		
		//obtendo os elementos do B
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("VETOR B - índice nº %d = \n", i+1);
			QB[i] = read.nextInt();
		}
		
		//inserindo de maneira intercalada os elementos de QA e QB
		for(int i = 0; i < 5; i++)
		{
			QC[aux] = QA[i];
			aux++;
			
			QC[aux] = QB[i];
			aux++;
		}
		
		//exibindo o vetor QC
		for(int i = 0; i < 10; i++)
		{
			System.out.printf("[%d] ", QC[i]);
		}
		
	}
}

