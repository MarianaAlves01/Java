/*
 * Ex3.java
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


public class Ex3 {
	
	public static void main (String[] args) {
		
		String letras = "";

		for (int i = 0; i < 26; i++) 
		{
			//a String letras (le-se como se fosse uma frase) toda vez que passar pelo FOR ir� receber mais uma letra do alfabeto (char), como se fosse um array
			letras += (char)('a' + i);
		}

		//imprimindo a String
		System.out.print(letras);
		
	}
}

