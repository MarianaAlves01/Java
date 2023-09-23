/*
 * Ex29.java
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

public class Ex29 {
	
	public static void main (String[] args) {
		for(int i = 1; i <= 10; i ++)
		{
			System.out.print(i + ", ");
			
			for(int j = 1; j <= 10; j++)
			{
				if(i % 2 == 0)
				{
					if(j % 2 == 0)
					{
						System.out.print(j + " ");
					}
				}
				else
				{
					if(j % 2 != 0)
					{
						System.out.print(j + " ");
					}
				}
				
			}
			
			System.out.println(" ");
		}
	}
}

