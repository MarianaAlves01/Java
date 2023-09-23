/*
 * VerificaValorProduto.java
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

public class VerificaValorProduto {
	
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Insira o preco do produto 1: ");
		int precoProduto1  = read.nextInt();
		
		System.out.print("Insira o preco do produto 2: ");
		int precoProduto2  = read.nextInt();
		if(precoProduto1 < 1 || precoProduto1 > 1000 || precoProduto1 < 1 || precoProduto1 > 1000)
		{
			System.out.println("VALOR INVALIDO");
		}
		else if(precoProduto1 < precoProduto2)
		{
			System.out.println("Produto 1 é o mais barato.");
		}
		else if (precoProduto2 < precoProduto1)
		{
			System.out.println("Produto 2 é o mais barato.");
		}
		else
		{
			System.out.println("Os preços dos dois produtos são iguais.");
		}
	}
}

