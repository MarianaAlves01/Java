/*
 * Ex17.java
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

public class Ex17 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner (System.in);
		
		char choose;
		
		do
		{
			System.out.print("Insira a primeira nota: ");
			double nota1 = read.nextDouble();
			
			if(nota1 < 0 || nota1 > 10)
			{
				do
				{
					System.out.print("INVÁLIDO! A nota deve estar entre 0 e 10: ");
					nota1 = read.nextDouble();
				}while(nota1 < 0 || nota1 > 10);
			}
			
			System.out.print("Insira a segunda nota: ");
			double nota2 = read.nextDouble();
			
			if(nota2 < 0 || nota2 > 10)
			{
				do
				{
					System.out.print("INVÁLIDO! A nota deve estar entre 0 e 10: ");
					nota2 = read.nextDouble();
				}while(nota2 < 0 || nota2 > 10);
			}
			
			double media = (nota1 + nota2)/2;
			
			System.out.println("A média é: " + media);
			
			System.out.println(" ");
			
			System.out.println("NOVO CÁLCULO (S/N)? ");
			String escolha = read.next();
			escolha = escolha.toUpperCase();
			choose = escolha.charAt(0);
			
		}while(choose != 'N');
		
		System.out.println(" ");
		System.out.println("Sistema encerrado!");
	}
}

