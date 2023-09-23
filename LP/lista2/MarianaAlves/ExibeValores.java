/*
 * ExibeValores.java
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


public class ExibeValores {
	
	public static void main (String[] args) {
		//valores 19, 1571, 100000, 2147483648, 3.14, 3.141592653589793,true e 'K'.
		byte num_dois_digitos = 19;
		short num_quarto_digitos = 1571;
		int num_cinco_digitos = 100000;
		long dez_digitos = 2147483647;
		float pi_menor = 3.14f;
		double pi_maior = 3.141592653589793;
		boolean vdd = true;
		char letra = 'K';
		
		System.out.println(num_dois_digitos +"\n"+ 
						   num_quarto_digitos +"\n"+ 
						   num_cinco_digitos +"\n"+ 
						   dez_digitos +"\n"+
						   pi_menor +"\n"+
						   pi_maior +"\n"+
						   vdd +"\n"+
						   letra);
	}
}

