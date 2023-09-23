/*
 * Ex31.java
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

import java.util.Arrays;
import java.util.Scanner;

public class Ex31 
{	
	public static void main (String[] args) 
	{
		Scanner read = new Scanner (System.in);
		Scanner readS = new Scanner(System.in);

		int n = 0;
        
        do 
        {
            System.out.print("Digite o tamanho do vetor: ");
            n = read.nextInt();
            
            if (n < 1 || n > 10) 
            {
                System.out.println("Digite um valor no intervalo [1, 10]!");
            }
        } while (n < 1 || n > 10);
        
        
        String[] am = new String[n];
        
        for (int i = 0; i < am.length; i++) 
        {
            System.out.printf("[%d] = ", i);
            am[i] = readS.nextLine();
        }
        
        System.out.print("Vetor: ");
        for(String item : am)
        {
			System.out.print(item + " ");
		}
        Arrays.sort(am);
        
        
        System.out.print("Vetor ordenado: ");
        for(String item : am)
        {
			System.out.print(item + " ");
		}
	}
}

