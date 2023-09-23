/*
 * ValorFrete.java
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

public class ValorFrete {
	
	public static void main (String[] args) {
				
		Scanner read = new Scanner (System.in);
		
		
		System.out.print("Preço do produto: ");
		double preco = read.nextDouble();
		
		System.out.print("Código de origem: ");
		int cod = read.nextInt();
		
		double frete;
		double valor_final;
			
		if(cod == 1)
		{
				frete = preco * 0.1;
				valor_final = preco + frete;
				System.out.println("Preço do Produto: " + preco + "\n" +
								   "Código de Origem: " + cod + "\n" +
								   "Região de procedência: Norte\n"+
								   "Frete: " + frete + "\n"+
								   "Valor Final: " + valor_final);
		}
		else if(cod == 2 || cod == 5 ||cod == 9)
		{
				frete = preco * 0.03;
				valor_final = preco + frete;
				System.out.println("Preço do Produto: " + preco + "\n" +
								   "Código de Origem: " + cod + "\n" +
								   "Região de procedência: Sul\n"+
								   "Frete: " + frete + "\n"+
								   "Valor Final: " + valor_final);
		}
		else if(cod == 3 || cod == 10 ||cod == 11 || cod == 12 || cod == 13 ||cod == 14 || cod == 15)
		{
			
				frete = preco * (1.2/100);
				valor_final = preco + frete;
				System.out.println("Preço do Produto: " + preco + "\n" +
								   "Código de Origem: " + cod + "\n" +
								   "Região de procedência: Leste\n"+
								   "Frete: " + frete + "\n"+
								   "Valor Final: " + valor_final);
		}
		else if(cod == 7 || cod == 20 )
		{
			frete = preco * (7.3/100);
			valor_final = preco + frete;
				System.out.println("Preço do Produto: " + preco + "\n" +
								   "Código de Origem: " + cod + "\n" +
								   "Região de procedência: Oeste\n"+
								   "Frete: " + frete + "\n"+
								   "Valor Final: " + valor_final);
		}
		else
		{
				frete = preco * (22.2/100);
				valor_final = preco + frete;
				System.out.println("Preço do Produto: " + preco + "\n" +
								   "Código de Origem: " + cod + "\n" +
								   "Região de procedência: Importado\n"+
								   "Frete: " + frete + "\n"+
								   "Valor Final: " + valor_final);
		}
	}
}

