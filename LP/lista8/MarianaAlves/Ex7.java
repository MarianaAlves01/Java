/*
 * Ex7.java
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

public class Ex7 
{	
	public static void main (String[] args) 
	{	
		Scanner read = new Scanner (System.in);
		int pos, maior = 0, menor = Integer.MAX_VALUE;
		
		
		do
		{
			System.out.print("Quantidade de posi��es [1 - 20]: ");
			pos = read.nextInt();
			
			//espa�amento
			System.out.println(" ");
			
		}while(pos > 20 || pos < 1);
		
		
		//criando vetor
		int [] vetorD = new int [pos];
		
		
		//obtendo os elementos
		for(int i = 0; i < vetorD.length; i++)
		{
			System.out.printf("Valor do �ndice n� %d = ", i+1);
			vetorD[i] = read.nextInt();
		}
		
		//espa�amento
		System.out.println(" ");
			
		
		//obtendo o maior e menor elementos
		for(int i = 0; i < pos; i++)
		{
			if(vetorD[i] < menor)
			{
				menor = vetorD[i];
			}
			if(vetorD[i] > maior)
			{
				maior = vetorD[i];
			}
		}
		
		System.out.printf("Maior valor = %d \nMenor valor = %d", maior, menor);
		
	}
}
