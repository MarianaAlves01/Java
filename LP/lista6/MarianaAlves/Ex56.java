/*
 * Ex56.java
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


public class Ex56 {
	
	public static void main (String[] args) {
		
		int div = 0;
		
		for(int i = 1; i <= 900; i++)
		{
			for(int p = 1; p <= (i/2); p++)
			{
				if(i % p == 0)
				{
					div += p;
				}
			}
			
			System.out.print((i == div)? " " + i : "");
			
			div = 0;
		}
	}
}

