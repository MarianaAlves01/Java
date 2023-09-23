/*
 * TempoXadrez.java
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

public class TempoXadrez {
	
	public static void main (String[] args) {
		
		Scanner imput = new Scanner(System.in);

		System.out.println("Digite a hora de inicio: ");
		int inicio = imput.nextInt();

		System.out.println("Digite a hora final: ");
		int fim = imput.nextInt();

		int temp = fim - inicio;

		if(temp < 0)
		{
			int dia = temp + 24;
			System.out.println("O jogo teve "+dia+" horas de duração");

		}
		else
		{
			System.out.println("O jogo teve "+temp+" horas de duração");
		}
	}
}

