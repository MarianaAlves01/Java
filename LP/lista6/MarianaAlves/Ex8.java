/*
 * Ex8.java
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

public class Ex8 {
	
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		int negativos = 0;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Digite um n�mero: ");
			int num = read.nextInt();
			
			if(num < 0)
			{
				negativos ++;
			}
		}
		
		System.out.println("Quantidade de n�meros negativos: " + negativos);
	}
}

