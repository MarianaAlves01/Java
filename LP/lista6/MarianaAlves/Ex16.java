/*
 * Ex16.java
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

public class Ex16 {
	
	public static void main (String[] args) {
		
		int soma = 0;
		int media;
		int total_num = 0;
		
		for(int g = 15; g <= 100; g++ )
		{
			soma += g;
			total_num ++;
		}
		
		media = soma/total_num;
		
		System.out.println("Média aritmética dos números compreendidos entre 15 e 100: " + media);
	}
}

