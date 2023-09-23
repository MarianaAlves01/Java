/*
 * Saudacao.java
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
import java.lang.Math;
import java.util.Scanner;

public class Saudacao {
	
	public static void main (String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		System.out.print("0		-	Manual\n"+
						 "1		-	Aleatório\n"+
						 "Resposta: ");
		int choose = read.nextInt();
		
		if(choose == 0)
		{
			System.out.print("Insira o horario: ");
			int hora = read.nextInt();
			
			if(hora < 0 || hora > 23)
			{
				System.out.println("VALOR INVALIDO");
				
			}
			else
			{
				if(hora >= 0 && hora < 7)
				{
					System.out.println("Zzzzz");
				}
				else if(hora >= 7 && hora < 12)
				{
					System.out.println("Bom dia");
				}
				else if(hora >= 12 && hora < 18)
				{
					System.out.println("Boa tarde");
				}
				else if(hora >= 18 && hora < 24)
				{
					System.out.println("Boa noite");
				}
			}
			
		}
		else if (choose == 1)
		{
			int hora = (int)(Math.random()*23);
			
				if(hora >= 0 && hora < 7)
				{
					System.out.println("Zzzzz");
				}
				else if(hora >= 7 && hora < 12)
				{
					System.out.println("Bom dia");
				}
				else if(hora >= 12 && hora < 18)
				{
					System.out.println("Boa tarde");
				}
				else if(hora >= 18 && hora < 24)
				{
					System.out.println("Boa noite");
				}
			
		}	
		else
		{
			System.out.println("VALOR INVALIDO");
			
		}
		
		
	}
}

