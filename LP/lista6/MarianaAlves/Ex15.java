/*
 * Ex15.java
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

public class Ex15 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner (System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int valor1 = read.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int valor2 = read.nextInt();
		
		int soma = 0;
		
		if(valor2 < valor1)
		{
			for(int i = valor2; i <= valor1; i++)
			{
				soma += i;
			}
		
			System.out.println("Soma dos números no intervalo de " + valor2 + " e " + valor1 + " é igual a " + soma);
		
		}
		else
		{
			for(int i = valor1; i <= valor2; i++)
			{
				soma += i;
			}
		
			System.out.println("Soma dos números no intervalo de " + valor1 + " e " + valor2 + " é igual a " + soma);
		
		}
		
		
		
		
		
	}
}

