/*
 * Comissao.java
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

public class Comissao {
	
	public static void main (String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		System.out.print("Salário fixo: ");
		double salario_fixo = read.nextDouble();
		
		System.out.print("Valor total das vendas: ");
		double valor_vendas = read.nextDouble();
		
		double comissao = 0.03;
		
		double total_comissao;
		
		if(valor_vendas <= 1500)
		{
			total_comissao = comissao * valor_vendas;
		}
		else
		{
			total_comissao =  (comissao * 1500) + (valor_vendas - 1500 ) * 0.05;
		}
		
		salario_fixo += total_comissao;
		
		System.out.println("Salário final é: " + salario_fixo);
		
	}
}

